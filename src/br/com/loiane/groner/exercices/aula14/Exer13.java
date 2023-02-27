package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1-Domingo\n2-Segunda\n3-Terça-feira\n4-Quarta-feira\n5-Quinta-feira\n6-Sexta-feira" +
                "\n7-Sábado");
        System.out.println("\nDigite o número correspondente a semana: ");
        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Segunda!");
                break;
            case 3:
                System.out.println("Terça-feira!");
                break;
            case 4:
                System.out.println("Quarta-feira!");
                break;
            case 5:
                System.out.println("Quinta-feira!");
                break;
            case 6:
                System.out.println("Sexta-feira!");
                break;
            case 7:
                System.out.println("Sabádo!");
                break;
            default:
                System.out.println("Inválido!");
        }
    }
}
