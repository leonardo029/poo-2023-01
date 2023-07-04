package main.java;

import java.util.Scanner;

public class Circulo {
    public int coordenadaX;
    public int coordenadaY;
    public int raio;

    public void transladar(int dx, int dy){
        coordenadaX += dx;
        coordenadaY += dy;
    }

    public void pegarValores(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor da coordenada X: ");
        coordenadaX = scanner.nextInt();
        System.out.println("Insira o valor da coordenada Y: ");
        coordenadaY = scanner.nextInt();
        System.out.println("Insira o valor do raio: ");
        raio = scanner.nextInt();
        scanner.close();
    }

    public void pegarValoresParaTransladar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor para transladar em X: ");
        int addX= scanner.nextInt();
        System.out.println("Insira o valor para transladar em Y: ");
        int addY= scanner.nextInt();
        scanner.close();
        transladar(addX, addY);
    }

    public static void Main(String[] args){
        Circulo circulo = new Circulo();
        circulo.pegarValores();
        circulo.pegarValoresParaTransladar();
    }
}
