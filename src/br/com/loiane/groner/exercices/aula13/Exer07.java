package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a área do quadrado: ");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println("o Dobro do quadrado é: " + area * 2);
    }
}
