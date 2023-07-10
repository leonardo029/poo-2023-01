package com.github.leonardo029.poo.t13;

public class ConcString {
    private static String firstName = "Leonardo ";
    private static String middleName1 = "Moreira ";
    private static String middleName2 = "de ";
    private static String lastName = "Araujo";
    public static void main(String[] args){
        System.out.println("-----Aluno dono do repositorio-----\n");
        System.out.println("Tipo 1");
        System.out.println("Nome: " + firstName.concat(middleName1.concat(middleName2.concat(lastName))) + "." + "\n");
        System.out.println("Tipo 2");
        System.out.println("Nome: " + firstName + middleName1 + middleName2 + lastName + ".");
    }
}