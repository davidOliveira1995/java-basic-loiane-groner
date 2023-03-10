package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("A: ");
        double a = scan.nextDouble();

        if (a == 0) {
            System.out.println("A == 0, equação não é do segundo grau !!");
        } else {

            System.out.println("B: ");
            double b = scan.nextDouble();

            System.out.println("C: ");
            double c = scan.nextDouble();

            double delta = Math.pow(b, 2) - 4 * a * c;

            double x1 = (-b + Math.sqrt(delta)) / 2 * a;
            double x2 = (-b - Math.sqrt(delta)) / 2 * a;

            if (delta > 0) {
                System.out.println("Delta: " + delta);
                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);
            } else {
                System.out.println("Delta Invalido!");
            }
        }
    }
}

