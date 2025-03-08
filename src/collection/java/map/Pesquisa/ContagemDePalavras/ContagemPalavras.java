package collection.java.map.Pesquisa.ContagemDePalavras;


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class ContagemPalavras {
private Map<String, Integer> palavras;

public ContagemPalavras(){
    this.palavras = new HashMap<>();
}

public void adicionarPalavra(String palavra, Integer contagem){
    if(palavra != null && !palavra.isEmpty()){
        palavras.put(palavra,palavras.getOrDefault(palavra,0) + contagem);
    }
}

public void removerPalavra(String palavra) {
    if(palavras.containsKey(palavra)){
        palavras.remove(palavra);
        System.out.println("Palavra removida com sucesso: " + palavra);
    }else{
        System.out.println("Palavra não encontrada: " + palavra);
    }
}

public void exibirContagemPalavras() {
    if(palavras.isEmpty()){
        System.out.println("Nenhuma palavra registrada.");
    }else{
        System.out.println("Contagem de palavras: ");
        for(Map.Entry<String,Integer> entry : palavras.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

public void encontrarPalavraMaisFrequente() {
    if(palavras.isEmpty()){
        System.out.println("Nenhuma palavra registrada");
        return;
    }

    String palavraMaisFrequente = Collections.max(palavras.entrySet(), Map.Entry.comparingByValue()).getKey();
    Integer contagem = palavras.get(palavraMaisFrequente);
    System.out.println("Palavra mais frequente: " + palavraMaisFrequente + " - Quantidade: " + contagem);
}

public static void main(String[] args) {
    ContagemPalavras contagem = new ContagemPalavras();

    contagem.adicionarPalavra("Java", 3);
    contagem.adicionarPalavra("Programação", 5);
    contagem.adicionarPalavra("Java", 2);
    contagem.adicionarPalavra("Código", 1);

    contagem.exibirContagemPalavras();
    contagem.encontrarPalavraMaisFrequente();
    contagem.removerPalavra("Código");
    contagem.exibirContagemPalavras();
}
}
