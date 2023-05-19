package exerciciosAula2;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        /**
         * Questão 3 - Crie um programa que leia a idade de uma pessoa e verifique se ela é maior de idade ou não.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println(idade >= 18 ? "Maior de idade!!" : "Menor de idade!!");
    }
}
