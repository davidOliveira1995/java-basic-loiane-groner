package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        int dia = scan.nextInt();

        System.out.println("Digite o mês: ");
        int mes = scan.nextInt();

        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();

        String data = dia + "/" + mes + "/" + ano;

        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano > 1900)  {
            System.out.println("Data: " + data);
        } else {
            System.out.println("Data Inválida !!");
        }
    }
}
