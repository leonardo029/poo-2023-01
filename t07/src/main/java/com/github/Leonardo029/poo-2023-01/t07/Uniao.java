package com.github.Leonardo029.poo-2023-01.t07;

public class Uniao {
    private ArrayList filhos;
    private Pessoa parceiros[2];

    public void novoFilho(Pessoa p){
        filhos.add(p);
    }

    public Uniao(Pessoa a, Pessoa b){
        parceiros[0] = a;
        parceiros[1]= b;
    }

}
