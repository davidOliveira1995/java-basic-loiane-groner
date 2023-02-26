package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nota 1°: ");
        int primeiraNota = scan.nextInt();

        System.out.println("Nota 2°: ");
        int segundaNota = scan.nextInt();

        System.out.println("Nota 3°: ");
        int terceiraNota = scan.nextInt();

        if (primeiraNota > segundaNota && primeiraNota > terceiraNota) {
            System.out.println("A maior é: " + primeiraNota);
        } else if (segundaNota > primeiraNota && segundaNota > terceiraNota) {
            System.out.println("A maior é: " + segundaNota);
        } else {
            System.out.println("A maior é: " + terceiraNota);
        }
    }
}
