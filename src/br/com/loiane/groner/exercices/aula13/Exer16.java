package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tamanho do comodo em metros quadrados: ");
        int metrosQuadrado = scan.nextInt();

        double coberturaTinta = 18 * 3;
        double latas = 1;
        double custo = 0;

        while (coberturaTinta <= metrosQuadrado) {
            latas++;
            custo = 80 * latas;
        }

        System.out.println("Metros: " + metrosQuadrado);
        System.out.println("Cobertura: " +coberturaTinta);
        System.out.println("Latas: " + latas);
        System.out.println("Custo: R$ " +  custo);
    }
}
