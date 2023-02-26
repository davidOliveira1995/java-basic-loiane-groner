package br.com.loiane.groner.exercices.aula14;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nota 1°: ");
        int primeiraNota = scan.nextInt();

        System.out.println("Nota 2°: ");
        int segundaNota = scan.nextInt();

        System.out.println("Nota 3°: ");
        int terceiraNota = scan.nextInt();

        if (primeiraNota > segundaNota && segundaNota > terceiraNota && primeiraNota > terceiraNota) {
            System.out.println("A maior é: " + primeiraNota);
            System.out.println("A menor é: " + terceiraNota);
        } else if (primeiraNota > segundaNota && terceiraNota > segundaNota && primeiraNota > terceiraNota) {
            System.out.println("A maior é: " + primeiraNota);
            System.out.println("A menor é: " + segundaNota);
        } else if (segundaNota > primeiraNota && primeiraNota > terceiraNota && segundaNota > terceiraNota){
            System.out.println("A maior é: " + segundaNota);
            System.out.println("A menor é: " + terceiraNota);
        } else if(segundaNota > primeiraNota && terceiraNota > primeiraNota && segundaNota > terceiraNota) {
            System.out.println("A maior é: " + segundaNota);
            System.out.println("A menor é: " + primeiraNota);
        } else if(terceiraNota > primeiraNota && primeiraNota > segundaNota && terceiraNota > segundaNota) {
            System.out.println("A maior é: " + terceiraNota);
            System.out.println("A menor é: " + segundaNota);
        } else if(terceiraNota > primeiraNota && segundaNota > primeiraNota && terceiraNota > segundaNota) {
            System.out.println("A maior é: " + terceiraNota);
            System.out.println("A menor é: " + primeiraNota);
        }
    }
}
