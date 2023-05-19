package exerciciosAula2;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {

        /**
         * Questão 6 - Crie um programa que leia três números inteiros e verifique se eles foram um triângulo válido.
         * Um triângulo válido se a soma dos dois lados é sempre maior que o terceiro lado.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo: ");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o segundo lado do triângulo: ");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o terceiro lado do triângulo: ");
        int lado3 = scanner.nextInt();

        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
            System.out.println("O triângulo é válido!!");
        } else {
            System.out.println("Os lados não são válidos!!");
        }
    }
}
