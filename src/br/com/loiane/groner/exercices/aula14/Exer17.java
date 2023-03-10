package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();

        if (ano % 4 == 0) {
            System.out.println("Anos bissexto: " + ano);
        } else {
            System.out.println("Não bissexto: " + ano);
        }
    }
}
