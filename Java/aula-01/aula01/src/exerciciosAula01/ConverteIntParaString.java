package exerciciosAula01;

public class ConverteIntParaString {

    /**
     * Escreva um programa que recebe como entrada um valor do tipo "int" e o converte para o tipo String.
     */

    int valorNumber = 10;
    String valorString = Integer.toString(valorNumber);

    public void getValorConverte() {
        System.out.println("O Valor inteiro agora é a String " + valorString);
    }

}
