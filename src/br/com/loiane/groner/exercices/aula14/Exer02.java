package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();

        if (numero >= 0) {
            System.out.println("Número positivo ! Número: " + numero);
        } else {
            System.out.println("Número negativo ! Número: " + numero);
        }
    }
}
