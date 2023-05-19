package exerciciosLoopAula2;

public class Questao2 {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
                contador++;
            }
            double media = (double) soma / contador;
            System.out.println("A média dos números pares entre 1 e 100 é " + media);
        }
    }
}
