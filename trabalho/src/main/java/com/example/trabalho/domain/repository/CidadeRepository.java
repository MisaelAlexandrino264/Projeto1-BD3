package com.example.trabalho.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trabalho.domain.model.Cidade;
import com.example.trabalho.domain.model.Usuario;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
    List<Cidade> findByUsuario(Usuario usuario);
}
