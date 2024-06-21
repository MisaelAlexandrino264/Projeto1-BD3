package com.example.trabalho.domain.dto.cidade;

import com.example.trabalho.domain.Enum.ELingua;

public class CidadeResponseDTO {
    private Long id;
    private String pais;
    private String estado;
    private int populacao;
    private ELingua lingua;
    private int anoCriacao;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getPopulacao() {
        return populacao;
    }
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
    public ELingua getLingua() {
        return lingua;
    }
    public void setLingua(ELingua lingua) {
        this.lingua = lingua;
    }
    public int getAnoCriacao() {
        return anoCriacao;
    }
    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }
}
