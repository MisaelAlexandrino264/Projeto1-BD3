package com.example.trabalho.domain.dto.cidade;

public class CidadeRequestDTO {
    private String pais;
    private String estado;
    private String populacao;
    private String lingua;
    private int anoCriacao;
    
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
    public String getPopulacao() {
        return populacao;
    }
    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }
    public String getLingua() {
        return lingua;
    }
    public void setLingua(String lingua) {
        this.lingua = lingua;
    }
    public int getAnoCriacao() {
        return anoCriacao;
    }
    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }
}
