package com.stockscript;

public class Simbolo {
    public enum TipoDato {
        INT, FLOAT, BOOLEAN, STRING, CHAR
    }

    public TipoDato tipo;
    public Object valor;

    public Simbolo(TipoDato tipo, Object valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Simbolo{" + "tipo=" + tipo + ", valor=" + valor + '}';
    }
}
