package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int firstNumber = scan.nextInt();

        System.out.println("Digite outro número: ");
        int secondNumber = scan.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("A soma de " + firstNumber + " e " + secondNumber + " é " + sum);
    }
}
