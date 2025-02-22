package collection.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(altura, idade, nome));
    }

    public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("João", 20, 1.86);
        ordenacaoPessoa.adicionarPessoa("Paulo", 30, 1.60);
        ordenacaoPessoa.adicionarPessoa("Bruna", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Ana", 17, 1.66);

        System.out.println("Ordenação por Idade: " + ordenacaoPessoa.ordernarPorIdade());
        System.out.println("Ordenação por Altura: " + ordenacaoPessoa.ordenarPorAltura());
    }
}