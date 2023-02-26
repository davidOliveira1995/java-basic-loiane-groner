package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo: ");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet: ");
        double velocidadeInternet = scan.nextDouble();

        double tempo = tamanhoArquivo / velocidadeInternet;

        System.out.println("Tempo de download: " + tempo);
    }
}
