package exerciciosAula01;

public class Pessoa {

    /**
     * Crie uma classe chamada "Pessoa" com os seguintes atributos: nome (tipo String), idade (tipo int) e altura (tipo double).
     */

   private String nome = "Raiane";
   private int idade = 29;
   private double altura = 1.75;

//    public void apresentarPessoa() {
//        System.out.println("Oi, meu nome é " + nome + ", tenho " + idade + " anos de idade e tenho " + altura + " de altura.");
//    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
