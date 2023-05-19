package exerciciosLoopAula2;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        /**
         * Escreva um programa em Java que solicite ao usuário que forneça uma senha e, em seguida,
         * solicite a confirmação da senha. O programa deve continuar pedindo a confirmação até que a
         * senha seja confirmada ou até que o usuário erre a confirmação três vezes. Se o usuário errar a
         * confirmação três vezes, o programa deve exibir uma mensagem de erro e sair:
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua senha: ");
        String senha = input.nextLine();

        int tentativas = 0;
        boolean senhaConfirmada = false;

        while (tentativas < 3 && !senhaConfirmada) {
            System.out.print("Confirme a senha: ");
            String confirmacaoSenha = input.nextLine();

            if (confirmacaoSenha.equals(senha)) {
                System.out.println("Senha confirmada com sucesso!");
                senhaConfirmada = true;
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
                tentativas++;
            }
        }

        if (!senhaConfirmada) {
            System.out.println("Você excedeu o número máximo de tentativas. Acesso negado. \n Tente novamente mais tarde.");
        }

        input.close();
    }
}
