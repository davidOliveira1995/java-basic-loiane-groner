package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite lado 1 do triangulo: ");
        int ladoUm = scan.nextInt();

        System.out.println("Digite lado 2 do triangulo: ");
        int ladoDois = scan.nextInt();

        System.out.println("Digite lado 3 do triangulo: ");
        int ladoTres = scan.nextInt();

        String triangulo = "Triângulo Equilátero!";
        if (ladoUm + ladoDois > ladoTres || ladoDois + ladoTres > ladoUm || ladoUm + ladoTres > ladoDois) {

            if (ladoUm == ladoDois && ladoDois == ladoTres && ladoUm == ladoTres) {
                triangulo = "Triângulo Equilátero!";
            } else if(ladoUm == ladoDois || ladoDois == ladoTres || ladoTres == ladoUm) {
                triangulo = "Triângulo Isóscelis!";
            } else if(ladoUm != ladoDois && ladoUm != ladoTres && ladoDois != ladoTres) {
                triangulo = "Triângulo Escaleno!";
            }

            System.out.println(triangulo);
        }

    }
}
