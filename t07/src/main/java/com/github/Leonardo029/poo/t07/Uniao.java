package com.github.Leonardo029.poo.t07;

import java.util.ArrayList;

public class Uniao {
    private ArrayList filhos;
    private Pessoa parceiros[];
    ;

    public void novoFilho(Pessoa p){
        filhos.add(p);
    }

    public Uniao(Pessoa a, Pessoa b){
        parceiros[0] = a;
        parceiros[1]= b;
    }

}
