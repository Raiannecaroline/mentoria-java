package exerciciosAula01;

public class ConvertePalavra {

    /**
     *  Escreva um programa que recebe como entrada um valor do tipo String que representa um número inteiro e converte esse valor para o tipo int.
     */

    String valorString = "10";
    int valorNumber = Integer.parseInt(valorString);

    public void converteStringValor() {
        System.out.println("A String virou o número " + valorNumber);
    }
}
