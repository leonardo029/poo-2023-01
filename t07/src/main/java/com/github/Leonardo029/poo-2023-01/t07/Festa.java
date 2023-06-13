package com.github.Leonardo029.poo-2023-01.t07;

import java.util.TreeSet;

public class Festa {
    private TreeSet convidados = new TreeSet();
    
    public void novoConvidado(Convidado c){
        convidados.add(c);
    }

    public Festa(Convidado c){
        convidados.add(c);
    }
}
