package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota) /2;

        if (media == 10) {
            System.out.println("Aprovado com distinção ! Média: " + media);
        } else if(media >= 7) {
            System.out.println("Aprovado ! Média: " + media);
        } else {
            System.out.println("Reprovado ! Média: " + media);
        }
    }
}
