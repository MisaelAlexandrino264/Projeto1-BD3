package com.example.trabalho.domain.model;

import com.example.trabalho.domain.Enum.ELingua;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCidade")
    private Long id;
    @Column(nullable = false)
    private String pais;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private int populacao;
    @Column(nullable = false)
    private ELingua lingua;
    @Column(nullable = false)
    private int anoCriacao;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    
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
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
