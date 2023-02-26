package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite F- Feminino ou M- Masculino");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Sexo Masculino! Letra: " + sexo);
        } else if (sexo.equalsIgnoreCase("F")){
            System.out.println("Sexo Feminino! Letra: " + sexo);
        } else {
            System.out.println("Sexo Inválido! Letra: " + sexo);
        }
    }
}
