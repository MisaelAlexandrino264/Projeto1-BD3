package com.example.trabalho.domain.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.trabalho.domain.dto.cidade.CidadeRequestDTO;
import com.example.trabalho.domain.dto.cidade.CidadeResponseDTO;
import com.example.trabalho.domain.exception.ResourceNotFoundException;
import com.example.trabalho.domain.model.Cidade;
import com.example.trabalho.domain.model.Usuario;
import com.example.trabalho.domain.repository.CidadeRepository;

@Service
public class CidadeService implements ICRUDService<CidadeRequestDTO, CidadeResponseDTO> {
    @Autowired
    private CidadeRepository cidadeRepository;
    @Autowired
    private ModelMapper mapper;


    @Override
    public List<CidadeResponseDTO> obterTodos() {
        Usuario usuario = (Usuario) SecurityContextHolder
       .getContext().getAuthentication().getPrincipal();
       List<Cidade> lista = cidadeRepository.findByUsuario(usuario);
       return lista.stream().map(cidade -> mapper.map(cidade, CidadeResponseDTO.class)).collect(Collectors.toList());
    }


    @Override
    public CidadeResponseDTO obterPorId(Long id) {
        Optional<Cidade> optCidade = cidadeRepository.findById(id);
       if(optCidade.isEmpty()){
        throw new ResourceNotFoundException("Não foi possível encontrar a cidade com o id: " + id);
       }
       Usuario usuario = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
       if(optCidade.get().getUsuario().getId() != usuario.getId()){
            throw new ResourceNotFoundException("A cidade com o id: " +
            id + "não existe!");
       }
       return mapper.map(optCidade.get(), CidadeResponseDTO.class);
    }

    @Override
    public CidadeResponseDTO cadastrar(CidadeRequestDTO dto) {
        Cidade cidade = mapper.map(dto, Cidade.class);
        Usuario usuario = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        cidade.setUsuario(usuario);
        cidade.setId(null);
        cidade = cidadeRepository.save(cidade);
        return mapper.map(cidade, CidadeResponseDTO.class);
    }

    @Override
    public CidadeResponseDTO atualizar(Long id, CidadeRequestDTO dto) {
        obterPorId(id);
        Cidade cidade = mapper.map(dto, 
        Cidade.class);
        Usuario usuario = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        cidade.setUsuario(usuario);
        cidade.setId(id);
        cidade = cidadeRepository.save(cidade);
        return mapper.map(cidade, 
        CidadeResponseDTO.class);
    }

    @Override
    public void deletar(Long id) {
        obterPorId(id);
        cidadeRepository.deleteById(id);
    }
    
}
