package com.github.leonardo029.poo.t18;

public class Main {
    public static void main(String[] args){
        Partida partidaImortal = new Partida("Partida Imortal");
        System.out.println("\n" + partidaImortal.getNome()+"\n");
        partidaImortal.AddLance();
        System.out.println(partidaImortal.toString());
    }
}
