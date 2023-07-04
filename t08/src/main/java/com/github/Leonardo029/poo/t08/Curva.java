package com.github.leonardo029.poo.t08;

import java.util.ArrayList;

public class Curva {
    private ArrayList<Ponto> pontos;
    private int quantidadeDePontos;

    public boolean Tamanho(){
        if(quantidadeDePontos>=2){
            return true;
        }else{
            return false;
        }
    }
}