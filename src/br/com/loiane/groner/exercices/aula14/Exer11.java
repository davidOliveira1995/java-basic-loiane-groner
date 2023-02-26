package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = scan.nextDouble();

        double reajuste;
        double salarioReajustado;
        int percentual;

        if (salario <= 280) {
            reajuste = (salario / 100) * 20;
            salarioReajustado = (salario / 100) * 120;
            percentual = 20;

        } else if (salario > 280 && salario <= 700) {
            reajuste = (salario / 100) * 15;
            salarioReajustado = (salario / 100) * 115;
            percentual = 15;

        } else if(salario > 700 && salario <= 1500) {
            reajuste = (salario / 100) * 10;
            salarioReajustado = (salario / 100) * 110;
            percentual = 10;

        } else {
            reajuste = (salario / 100) * 5;
            salarioReajustado = (salario / 100) * 105;
            percentual = 5;

        }

        System.out.println("Salário: R$ " + salario);
        System.out.println("Percentual aplicado: " + percentual + "%.");
        System.out.println("Reajuste: R$ " + reajuste);
        System.out.println("Salário Reajustado: R$ " + salarioReajustado);
    }
}
