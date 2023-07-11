package com.github.leonardo029.poo.t18;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private String nome;
    private List<Lance> lances = new ArrayList<Lance>();

    public String getNome(){
        return nome;
    }

    public Partida(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lances.size(); i++) {
            Lance lan = lances.get(i);
            sb.append(lan.toString()).append("\n");
        }

        return sb.toString();
    }

    public void AddLance(){

        //Adicionando os lances
        Lance lance = new Lance();
        lance.setNumero("1.");
        lance.Peca1(" ");
        lance.Mov1("e", "4");
        lance.Peca2(" ");
        lance.Mov2("e", "5");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("2.");
        lance.Peca1(" ");
        lance.Mov1("f", "4");
        lance.Peca2(" ex");
        lance.Mov2("f", "4");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("3.");
        lance.Peca1(" B");
        lance.Mov1("c", "4");
        lance.Peca2(" D");
        lance.Mov2("h", "4+");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("4.");
        lance.Peca1(" R");
        lance.Mov1("f", "1");
        lance.Peca2(" ");
        lance.Mov2("b", "5?!");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("5.");
        lance.Peca1(" B");
        lance.Mov1("xb", "5");
        lance.Peca2(" C");
        lance.Mov2("f", "6");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("6.");
        lance.Peca1(" C");
        lance.Mov1("f", "3");
        lance.Peca2(" D");
        lance.Mov2("h", "6");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("7.");
        lance.Peca1(" ");
        lance.Mov1("d", "3");
        lance.Peca2(" C");
        lance.Mov2("h", "5");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("8.");
        lance.Peca1(" C");
        lance.Mov1("h", "4");
        lance.Peca2(" D");
        lance.Mov2("g", "5");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("9.");
        lance.Peca1(" C");
        lance.Mov1("f", "5");
        lance.Peca2(" ");
        lance.Mov2("c", "6");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("10.");
        lance.Peca1(" ");
        lance.Mov1("g", "4");
        lance.Peca2(" C");
        lance.Mov2("f", "6");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("11.");
        lance.Peca1(" T");
        lance.Mov1("g", "1!");
        lance.Peca2(" cx");
        lance.Mov2("b", "5?");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("12.");
        lance.Peca1(" ");
        lance.Mov1("h", "4!");
        lance.Peca2(" D");
        lance.Mov2("g", "6");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("13.");
        lance.Peca1(" ");
        lance.Mov1("h", "5");
        lance.Peca2(" D");
        lance.Mov2("g", "5");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("14.");
        lance.Peca1(" D");
        lance.Mov1("f", "3");
        lance.Peca2(" C");
        lance.Mov2("g", "8");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("15.");
        lance.Peca1(" B");
        lance.Mov1("xf", "4");
        lance.Peca2(" D");
        lance.Mov2("f", "6");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("16.");
        lance.Peca1(" C");
        lance.Mov1("c", "3");
        lance.Peca2(" B");
        lance.Mov2("c", "5");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("17.");
        lance.Peca1(" C");
        lance.Mov1("d", "5");
        lance.Peca2(" D");
        lance.Mov2("xb", "2");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("18.");
        lance.Peca1(" B");
        lance.Mov1("d", "6!!");
        lance.Peca2(" B");
        lance.Mov2("xg", "1?");
        lances.add(lance);
        
        lance = new Lance();
        lance.setNumero("19.");
        lance.Peca1(" ");
        lance.Mov1("e", "5!");
        lance.Peca2(" D");
        lance.Mov2("xa", "1+");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("20.");
        lance.Peca1(" R");
        lance.Mov1("e", "2");
        lance.Peca2(" C");
        lance.Mov2("a", "6");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("21.");
        lance.Peca1(" C");
        lance.Mov1("xg", "7+");
        lance.Peca2(" R");
        lance.Mov2("d", "8");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("22.");
        lance.Peca1(" D");
        lance.Mov1("f", "6+");
        lance.Peca2(" C");
        lance.Mov2("xf", "6");
        lances.add(lance);

        lance = new Lance();
        lance.setNumero("23.");
        lance.Peca1(" B");
        lance.Mov1("e", "7");
        lance.Peca2("#");
        lance.Mov2(" 1-", "0");
        lances.add(lance);

    }

}
