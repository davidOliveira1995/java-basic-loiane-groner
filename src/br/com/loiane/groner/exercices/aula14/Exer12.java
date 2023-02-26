package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();

        double salario = horasTrabalhadas * valorHora;

        double impostoRenda = 0;

        if (salario <= 900) {
            impostoRenda = 0;
        } else if (salario > 900 && salario <= 1500) {
            impostoRenda = (salario / 100) * 5;
        } else if (salario > 1500 && salario <= 2500) {
            impostoRenda = (salario / 100) * 10;
        } else if(salario > 2500) {
            impostoRenda = (salario / 100) * 20;
        }

        double sindicato = (salario / 100) * 3;
        double inss = (salario / 100) * 10;
        double fgts = (salario / 100) * 11;
        double descontos = inss + impostoRenda;
        double salarioLiquido = salario - descontos;

        System.out.println("Salário Bruto: R$ " + salario);
        System.out.println("Imposto de renda: R$ " + impostoRenda);
        System.out.println("INSS: R$ " + inss);
        System.out.println("FGTS: R$ " + fgts);
        System.out.println("Sindicato : R$ " + sindicato);
        System.out.println("Total de descontos: R$ " + descontos);
        System.out.println("Salário Liquido: R$ " + salarioLiquido);
    }
}
