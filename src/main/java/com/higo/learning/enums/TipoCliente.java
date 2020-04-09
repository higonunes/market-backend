package com.higo.learning.enums;

public enum TipoCliente {

    PESSOAFISICA(1, "Pessoa Física"), PESSOAJURIDICA(2, "Pessoa Jurídica");

    private final int cod;
    private final String descricao;

    TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer cod) {
        if(cod == null) return null;

        for (TipoCliente x : TipoCliente.values()) {
            if(cod.equals(x.getCod())) return x;
        }

        throw new IllegalArgumentException("ID inválido");
    }
}