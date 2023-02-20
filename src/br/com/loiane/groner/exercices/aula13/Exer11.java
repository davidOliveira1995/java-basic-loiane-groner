package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite primeiro número inteiro: ");
        int primeiroNumero = scan.nextInt();

        System.out.println("Digite segundo número inteiro: ");
        int segundoNumero = scan.nextInt();

        System.out.println("Digite primeiro número Double: ");
        double primeiroNumeroDouble = scan.nextDouble();

        int a = (primeiroNumero * 2) + (segundoNumero / 2);
        double b = (primeiroNumero * 3) + primeiroNumeroDouble;
        double c = Math.pow(primeiroNumeroDouble, 3);

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);

    }
}
