package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        int centena = numero / 100;
        int dezena = (numero%100) / 10;
        int unidade = (numero%100)%10;

        System.out.println("Centena: " + centena);
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);
    }
}
