package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nota 1°: ");
        double notaUm = scan.nextDouble();

        System.out.println("Nota 2°: ");
        double notaDois = scan.nextDouble();

        System.out.println("Nota 3°: ");
        double notaTres = scan.nextDouble();

        double media = (notaUm + notaDois + notaTres) / 3;

        String mensagem = "";
        if (media == 10) {
            mensagem = "Aprovado com distinção!";
        } else if (media >= 7 && media < 10) {
            mensagem = "Aprovado !!";
        } else if(media < 7){
            mensagem = "Reprovado !";
        }

        System.out.println("Nota 1° Bimestre: " + notaUm);
        System.out.println("Nota 2° Bimestre: " + notaDois);
        System.out.println("Nota 3° Bimestre: " + notaTres);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + mensagem);
    }
}
