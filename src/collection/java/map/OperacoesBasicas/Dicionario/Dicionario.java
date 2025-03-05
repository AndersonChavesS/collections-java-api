package collection.java.map.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void remover(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavra() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String pesquisaPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            pesquisaPorPalavra = dicionarioMap.get(palavra);
        }
        return pesquisaPorPalavra;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe Dicionario.
        Dicionario meuDicionario = new Dicionario();

        // Adicionando palavras ao dicionário
        meuDicionario.adicionarPalavra("Java ", " Uma linguagem de programação orientada a objetos");
        meuDicionario.adicionarPalavra("Python ", " Uma linguagem de programação interpretada de alto nível");
        meuDicionario.adicionarPalavra("JavaScript ", " Uma linguagem de programação para web");

        // Exibindo todas as palavras do dicionário
        System.out.println("Dicionário completo: ");
        meuDicionario.exibirPalavra();

        // Pesquisando uma palavra no dicionário
        String definicao = meuDicionario.pesquisarPorPalavra("Java ");
        System.out.println("Definição de Java: " + definicao);

        //Removendo uma palavra
        meuDicionario.remover("Python ");
        System.out.println("Dicionário após remover Python: ");
        meuDicionario.exibirPalavra();

    }

}
