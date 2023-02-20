package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Digite: M- Masculino ou F- Femenino");
        String sexo = scan.next();

        double pesoIdeal = 0;

        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo Inválido !!");
        }

        System.out.println("Peso ideal: " +  pesoIdeal + "m");
    }
}
