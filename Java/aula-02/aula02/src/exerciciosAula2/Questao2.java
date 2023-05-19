package exerciciosAula2;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        /**
         * Questão 2 - Crie um programa que leia um número inteiro e verifique se ele é par ou impar.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        if (numeroInteiro % 2 == 0) {
            System.out.println("O número é par!!");
        } else {
            System.out.println("O número é impar!!");
        }
    }
}
