package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double farenheit = scan.nextInt();

        double celcius = (5 * (farenheit - 32) / 9);

        System.out.println("Farenheit: " + farenheit + " F°");
        System.out.println("Celcius: " + celcius + " C°");
    }
}
