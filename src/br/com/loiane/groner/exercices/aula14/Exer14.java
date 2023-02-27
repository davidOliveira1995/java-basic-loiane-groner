package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        String conceito;
        String aprovado;

        if (media > 9) {
            conceito = "A";
            aprovado = "Aprovado!";
        } else if(media > 7.5 && media <= 9) {
            aprovado = "Aprovado!";
            conceito = "B";
        } else if(media > 6 && media <= 7.5) {
            aprovado = "Aprovado!";
            conceito = "C";
        } else if(media > 4 && media <= 6) {
            aprovado = "Reprovado!";
            conceito = "D";
        } else {
            aprovado = "Reprovado!";
            conceito = "E";
        }

        System.out.println("Nota 1° Bimestre: " + primeiraNota);
        System.out.println("Nota 2° Bimestre: " + segundaNota);
        System.out.println("Media: " + media + ", Conceito: " + conceito + ", Fim: " + aprovado);
    }
}
