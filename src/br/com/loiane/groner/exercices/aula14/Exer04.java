package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scan.next();

        switch (letra) {
            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "I":
            case "o":
            case "O":
            case "u":
            case "U":
                System.out.println("Letra digitada: " + letra + ", é uma vogal !");
                break;
            default:
                System.out.println("Letra digitada: " + letra + ", é uma consoante !");
        }
    }
}
