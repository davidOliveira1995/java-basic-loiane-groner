package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scan.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O maior: " + primeiroNumero + ", o menor: " + segundoNumero);
        } else if(segundoNumero > primeiroNumero) {
            System.out.println("O maior: " + segundoNumero + ", o menor: " + primeiroNumero);
        } else {
            System.out.println("Ambos são iguais !!");
        }
    }
}
