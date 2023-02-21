package br.com.loiane.groner.exercices.aula13;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor do salário por hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Horas trabalhadas no mês: ");
        int horaTrabalhadas = scan.nextInt();

        double salarioBruto = horaTrabalhadas * valorHora;

        double impostoDeRenda = (salarioBruto / 100) * 11;
        double inss = (salarioBruto / 100) * 8;
        double sindicado = (salarioBruto / 100) * 5;
        double descontos = impostoDeRenda + inss + sindicado;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Imposto de renda: R$ " + impostoDeRenda);
        System.out.println("INSS: R$ " + inss);
        System.out.println("Sindicado: R$ " + sindicado);
        System.out.println("Total descontos: R$ " + descontos);
        System.out.println("Salário Liquido: R$ " + salarioLiquido);

    }
}
