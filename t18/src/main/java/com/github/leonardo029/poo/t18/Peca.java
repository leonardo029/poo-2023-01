package com.github.leonardo029.poo.t18;

public class Peca {
    private String tipoDaPeca;

    public String getTipoDaPeca(){
        return tipoDaPeca;
    }
    public void setNome(String tipoDaPeca){
        this.tipoDaPeca = tipoDaPeca;
    }

    @Override
    public String toString(){
        return tipoDaPeca;
    }
}
