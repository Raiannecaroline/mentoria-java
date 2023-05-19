package exerciciosAula2;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        /**
         * Questão 5 - Crie um programa que leia um número de 1 a 7 e o exiba a da semana correspondente.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 e descrubra o dia da semana: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia da semana inválido!!");
        }
    }
}
