package com.github.leonardo029.poo.t18;

public class Lance {
    private String numero;
    private Jogador jogador;
    private Peca peca1 = new Peca(), peca2 = new Peca();
    private Posicao movimento1 = new Posicao(), movimento2 = new Posicao();

    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void Peca1(String nome){
        peca1.setNome(nome);
    }
    public void Peca2(String nome){
        peca2.setNome(nome);
    }
    public void Mov1(String nome1, String nome2){
        movimento1.setNomeX(nome1);
        movimento1.setNomeY(nome2);
    }
    public void Mov2(String nome1, String nome2){
        movimento2.setNomeX(nome1);
        movimento2.setNomeY(nome2);
    }

    @Override
    public String toString(){
        return numero + peca1.toString() + movimento1.toString() + peca2.toString()+ movimento2.toString();
    }

}
