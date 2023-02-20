package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");
        int metros = scan.nextInt();

        int centimetros = metros * 100;

        System.out.println(metros + "m em centimentros é: " + centimetros + "cm.");

    }
}
