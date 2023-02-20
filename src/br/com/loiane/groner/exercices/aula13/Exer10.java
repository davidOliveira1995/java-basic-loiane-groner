package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em Celcius: ");
        double celcius = scan.nextDouble();

        double farenheit = (celcius * 9/5) + 32;

        System.out.println(celcius + " C° em Farenheit é: " + farenheit + " F°");
    }
}
