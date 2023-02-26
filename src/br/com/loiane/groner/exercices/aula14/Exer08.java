package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("TV 49 Phillips: R$");
        double tvPhillips = scan.nextDouble();

        System.out.println("TV 49 CCE: R$");
        double tvCCE = scan.nextDouble();

        System.out.println("TV 49 LG: R$");
        double tvLG = scan.nextDouble();

        if (tvPhillips < tvCCE && tvPhillips < tvLG) {
            System.out.println("TV Phillips: R$ " + tvPhillips);
        } else if(tvCCE < tvPhillips && tvCCE < tvLG) {
            System.out.println("TV CCE: R$ " + tvCCE);
        } else if(tvLG < tvPhillips && tvLG < tvCCE) {
            System.out.println("TV LG: R$ " + tvLG);
        }
    }
}
