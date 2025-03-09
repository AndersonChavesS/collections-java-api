package collection.java.map.Ordenacao.LivrariaOnline;

import java.util.*;

import java.util.stream.Collectors;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        livros.entrySet().removeIf(entry -> entry.getValue().getTitulo().equalsIgnoreCase(titulo));
    }

    public void exibirLivrosOrdenadosPorPreco() {
        livros.values().stream().sorted(new ComparatorPorPreco()).forEach(System.out::println);
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        return livros.values().stream().filter(livro -> livro.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }

    public Livro obterLivroMaisCaro() {
        return livros.values().stream().max(new ComparatorPorPreco()).orElse(null);
    }

    public Livro obterLivroMaisBarato() {
        return livros.values().stream().min(new ComparatorPorPreco()).orElse(null);
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://amazon.com/livro1", "Java para Iniciantes", "John Doe", 50.0);
        livraria.adicionarLivro("https://amazon.com/livro2", "Algoritmos Avançados", "Jane Smith", 75.0);
        livraria.adicionarLivro("https://amazon.com/livro3", "Estruturas de Dados", "John Doe", 65.0);

        System.out.println("\nLista de livros ordenados por preço:");
        livraria.exibirLivrosOrdenadosPorPreco();

        System.out.println("\nPesquisando livros do autor 'John Doe':");
        List<Livro> livrosJohnDoe = livraria.pesquisarLivrosPorAutor("John Doe");
        livrosJohnDoe.forEach(System.out::println);

        System.out.println("\nLivro mais caro:");
        System.out.println(livraria.obterLivroMaisCaro());

        System.out.println("\nLivro mais barato:");
        System.out.println(livraria.obterLivroMaisBarato());

        livraria.removerLivro("Java para Iniciantes");
        System.out.println("\nLista de livros após remoção:");
        livraria.exibirLivrosOrdenadosPorPreco();
    }
}
