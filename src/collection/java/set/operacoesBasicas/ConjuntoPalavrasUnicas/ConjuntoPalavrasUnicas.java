package collection.java.set.operacoesBasicas.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        if (!palavrasUnicas.add(palavra)) {
            System.out.println("❌ A palavra '" + palavra + "' já está no conjunto.");
        } else {
            System.out.println("✅ Palavra '" + palavra + "' adicionada.");
        }
    }

    public void removerPalavra(String palavra) {
        if (palavrasUnicas.remove(palavra)) {
            System.out.println("✅ Palavra '" + palavra + "' removida com sucesso!");
        } else {
            System.out.println("❌ Palavra '" + "' não encontrada.");
        }
    }

    public boolean vefificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (palavrasUnicas.isEmpty()) {
            System.out.println("❌ Nenhuma palavra única no conjunto.");
        } else {
            System.out.println("📖 Palavras únicas: " + palavrasUnicas);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();
        conjuntoPalavras.adicionarPalavra("Java");
        conjuntoPalavras.adicionarPalavra("Python");
        conjuntoPalavras.adicionarPalavra("Java");
        conjuntoPalavras.adicionarPalavra("JavaScript");
        conjuntoPalavras.exibirPalavrasUnicas();
        conjuntoPalavras.removerPalavra("Python");
        conjuntoPalavras.removerPalavra("HTML");
        conjuntoPalavras.exibirPalavrasUnicas();

        System.out.println("A palavra 'Java' está no conjunto? " + conjuntoPalavras.vefificarPalavra("Java"));
    }

}
