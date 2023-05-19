package exerciciosAula01;

public class ConverteNumero {

    /**
     * Escreva um programa que converte um valor do tipo double para o tipo int.
     */

    double numeroDouble = 101.0;
    int numeroInt = (int) numeroDouble;

    public void converteNumero() {
        System.out.println("O número double " + numeroDouble + " ficou assim como inteiro " + numeroInt);
    }

}
