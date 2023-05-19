package exerciciosAula2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        /**
         * Questão 4 - Crie um programa que leia três números e verifique qual é o maior deles.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O primeiro número é maior que os demais!");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O segundo número é maior que os demais");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("O terceiro número é maior que os demais");
        } else {
            System.out.println("Os números são iguais!!");
        }
    }
}
