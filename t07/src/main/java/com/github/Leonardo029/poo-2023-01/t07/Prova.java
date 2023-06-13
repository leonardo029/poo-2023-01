package com.github.Leonardo029.poo-2023-01.t07;

public class Prova {
   private byte numQuestoes;
   
   public byte getNumQuestoes(){
        return numQuestoes;
   }

   public void setNumQuestoes(byte n){
        if(n>0){
            numQuestoes = n;
        }
   }
}
