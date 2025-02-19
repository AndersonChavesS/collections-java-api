package main.java.list.Ordenacao;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(double altura, int idade, String nome) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "OrdenacaoPessoas{" +
                "altura=" + altura +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
