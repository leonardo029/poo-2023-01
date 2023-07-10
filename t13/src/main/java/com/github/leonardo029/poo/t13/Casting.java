package com.github.leonardo029.poo.t13;

public class Casting {

    public static void main(String[] args){

        int Int = 20000;
        double Double = Int;

        System.out.println("\nWidening Casting:");
        System.out.println(" Type int = " + Int);
        System.out.println(" Type double = " + Double + "\n");

        double Double2 = 2.1234560798950802938405784;
        int Int2 = (int) Double2;
        
        System.out.println("Narrowing Casting:");
        System.out.println(" Type double = " + Double2);
        System.out.println(" Type int = " + Int2);
    }
}
