package exerciciosAula2;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        /**
         * Questão 1 - Crie um programa que leia um número inteiro e verifique se ele é positivo ou negativo.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número digitado é positivo!!");
        } else {
            System.out.println("O número digitado é negativo!!");
        }
    }
}
