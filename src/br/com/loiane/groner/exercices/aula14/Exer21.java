package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do saque: ");
        double valor = scan.nextDouble();

        int notaUm;
        int notaDois;
        int notaCinco;
        int notaDez;
        int notaCinquenta;
        int notaCem;

        if (valor >= 10 && valor <= 600) {

            notaCem = (int) (valor / 100);
            notaCinquenta = (int) (valor%100) / 10;

            System.out.println("Notas de cem: " + notaCem);
            System.out.println("Notas de cinquenta: " + notaCinquenta);

        } else {
            System.out.println("Valor inválido !!");
        }
    }
}
