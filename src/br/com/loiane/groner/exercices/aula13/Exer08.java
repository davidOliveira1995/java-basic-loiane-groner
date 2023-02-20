package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu salário, valor por hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Número de horas trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("O Salário é: R$ " + salario);
    }
}
