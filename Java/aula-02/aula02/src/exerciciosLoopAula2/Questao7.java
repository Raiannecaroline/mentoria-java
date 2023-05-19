package exerciciosLoopAula2;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        /**
         * Escreva um programa em Java que leia uma lista de números inteiros fornecidos pelo usuário e
         * encontre o maior e o menor número na lista. O usuário deve fornecer a quantidade de números
         * que deseja inserir e, em seguida, inserir cada número um por vez. O programa deve exibir o maior
         * e o menor número após a entrada de todos os números.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja inserir: ");
        int quantidadeNumeros = input.nextInt();

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o número " + i + "°: ");
            int numero = input.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        input.close();
    }
}
