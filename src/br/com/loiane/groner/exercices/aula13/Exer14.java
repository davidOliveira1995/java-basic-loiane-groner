package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o peso da mercadoria: ");
        double peso = scan.nextDouble();

        double excesso = 0;
        double totalMulta = 0;
        if (peso > 40) {
            excesso = peso - 40;
            totalMulta = excesso * 4;
        }

        System.out.println("Peso total: " + peso + "kg\nExcesso de mercadoria: " + excesso + "kg\nTotal a pagar: R$ " + totalMulta);
    }
}
