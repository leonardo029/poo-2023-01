package com.github.Leonardo029.poo-2023-01.t07;

public class Religiao{
    private ArrayList devotos;

    public void novoFiel (Devoto d){
        devotos.add(d);
    }
}

public class Devoto(){
    public Devoto(Religiao r){
        r.novoFiel(this);
    }
}