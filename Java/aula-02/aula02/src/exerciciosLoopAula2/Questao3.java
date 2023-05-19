package exerciciosLoopAula2;

public class Questao3 {
    public static void main(String[] args) {
        /**
         * Crie um programa que leia números de 1 a 100 e mostre os pares e ímpares
         */

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i + " - É par!!");
            } else {
                System.out.println(i + " - É ímpar!!");
            }
        }
    }
}
