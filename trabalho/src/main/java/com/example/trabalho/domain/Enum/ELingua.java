package com.example.trabalho.domain.Enum;

public enum ELingua {
    PORTUGUES("portugues"),
    FRANCES("frances"),
    ESPANHOL("espanhol"),
    ALEMAO("alemao"),
    ITALIANO("alemao"),
    INGLES("ingles"),
    CHINES("chines");

    private String valor;

    private ELingua(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }
}
