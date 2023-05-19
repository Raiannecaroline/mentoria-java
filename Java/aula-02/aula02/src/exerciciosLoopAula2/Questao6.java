package exerciciosLoopAula2;

import java.util.Random;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        /**
         * Escreva um programa em Java que solicite ao usuário que adivinhe um número aleatório entre 1
         * e 100. O programa deve fornecer dicas ao usuário, dizendo se o número fornecido é maior ou
         * menor que o número aleatório, até que o usuário adivinhe corretamente:
         */

        Scanner scanner = new Scanner(System.in);
        Random numero = new Random();
        int numeroAdivinha = numero.nextInt(100) + 1;
        System.out.println("Insira um número e tente adivinhar o número certo de 1 a 100: ");

        int palpitei = scanner.nextInt();

        while (palpitei != numeroAdivinha) {
            if (palpitei < numeroAdivinha) {
                System.out.println("Tente um palpite maior!!");
            } else {
                System.out.println("Tente um palpite menor!!");
            }
            palpitei = scanner.nextInt();
        }
        System.out.println("Acertou Mizeravi!!");
    }
}
