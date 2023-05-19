package exerciciosLoopAula2;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        /**
         * Escreva um programa em Java que determine se um número inteiro positivo fornecido pelo usuário é um número primo ou não:
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número primo: ");
        int numeroPrimo = scanner.nextInt();

        boolean ohPrimo = true;

        for (int i = 2; i <= numeroPrimo/2; i++) {
            if (numeroPrimo % i == 0) {
                ohPrimo = false;
                break;
            }
        }

        if (ohPrimo) {
            System.out.println(numeroPrimo + "- É um número primo");
        } else {
            System.out.println(numeroPrimo + " - Não é um número primo");
        }
    }
}
