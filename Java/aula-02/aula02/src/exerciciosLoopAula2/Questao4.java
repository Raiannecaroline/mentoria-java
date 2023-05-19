package exerciciosLoopAula2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        /**
         * Escreva um programa em Java que calcule o fatorial de um número inteiro não negativo fornecido pelo usuário.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inisira um número não negativo: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println(numero + "! = " + fatorial);
    }
}
