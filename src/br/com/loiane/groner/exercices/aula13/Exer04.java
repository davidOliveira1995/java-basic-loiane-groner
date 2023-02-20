package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do 1° Bimestre: ");
        double notaUm = scan.nextDouble();

        System.out.println("Digite a nota do 2° Bimestre: ");
        double notaDois = scan.nextDouble();

        System.out.println("Digite a nota do 3° Bimestre: ");
        double notaTres = scan.nextDouble();

        System.out.println("Digite a nota do 4° Bimestre: ");
        double notaQuatro = scan.nextDouble();

        double mediaBimestral = (notaUm + notaDois + notaTres + notaQuatro) / 4;

        System.out.println("Média Bimestral: " + mediaBimestral);
    }
}
