package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1° número: ");
        int primeiroNumero = scan.nextInt();

        System.out.println("Digite o 2° número: ");
        int segundoNumero = scan.nextInt();

        System.out.println("Digite o 3° número: ");
        int terceiroNumero = scan.nextInt();

        if (primeiroNumero > segundoNumero && segundoNumero > terceiroNumero) {
            System.out.println("1°: " + primeiroNumero);
            System.out.println("2°: " + segundoNumero);
            System.out.println("3°: " + terceiroNumero);
        } else if(primeiroNumero > terceiroNumero && terceiroNumero > segundoNumero) {
            System.out.println("1°: " + primeiroNumero);
            System.out.println("2°: " + terceiroNumero);
            System.out.println("3°: " + segundoNumero);
        } else if (segundoNumero > primeiroNumero && primeiroNumero > terceiroNumero) {
            System.out.println("1°: " + segundoNumero);
            System.out.println("2°: " + primeiroNumero);
            System.out.println("3°: " + terceiroNumero);
        } else if(segundoNumero > terceiroNumero && terceiroNumero > primeiroNumero) {
            System.out.println("1°: " + segundoNumero);
            System.out.println("2°: " + terceiroNumero);
            System.out.println("3°: " + primeiroNumero);
        } else if (terceiroNumero > segundoNumero && segundoNumero > primeiroNumero) {
            System.out.println("1°: " + terceiroNumero);
            System.out.println("2°: " + segundoNumero);
            System.out.println("3°: " + primeiroNumero);
        } else if (terceiroNumero > primeiroNumero && primeiroNumero > segundoNumero) {
            System.out.println("1°: " + terceiroNumero);
            System.out.println("2°: " + primeiroNumero);
            System.out.println("3°: " + segundoNumero);
        }
    }
}
