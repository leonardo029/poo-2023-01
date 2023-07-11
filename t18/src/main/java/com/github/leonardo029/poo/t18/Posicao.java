package com.github.leonardo029.poo.t18;

public class Posicao {
    private String posicaoX;
    private String posicaoY;

    public String getPosicaoX(){
        return posicaoX;
    }
    public void setNomeX(String posicaoX){
        this.posicaoX = posicaoX;
    }

    public String getPosicaoY(){
        return posicaoY;
    }
    public void setNomeY(String posicaoY){
        this.posicaoY = posicaoY;
    }

    @Override
    public String toString(){
        return posicaoX + posicaoY;
    }
}
