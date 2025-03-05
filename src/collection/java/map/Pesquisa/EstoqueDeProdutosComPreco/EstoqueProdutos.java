package collection.java.map.Pesquisa.EstoqueDeProdutosComPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
private Map<Long, Produto> estoqueProdutosMap;

public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
}

public void adicionarProduto(long cod, String nome, int quantidade, double preco){
    estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
}

public void exibirProdutos() {
    System.out.println(estoqueProdutosMap);
}

public double calcularValorTotalEstoque() {
    double valorTotalEstoque = 0;
    if(!estoqueProdutosMap.isEmpty()) {
        for(Produto p : estoqueProdutosMap.values()){
            valorTotalEstoque = p.getQuantidade() * p.getPreco();
        }
    }
    return valorTotalEstoque;
}

public Produto obterProdutoMaisCaro(){
    Produto produtoMaisCaro = null;

    double maiorPreco = Double.MIN_VALUE;

    if(!estoqueProdutosMap.isEmpty()){
        for(Produto p : estoqueProdutosMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
    }
    return produtoMaisCaro;
}

public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBarato = null;

    double menorPreco = Double.MAX_VALUE;

    if(!estoqueProdutosMap.isEmpty()){
        for(Produto p : estoqueProdutosMap.values()){
            if(p.getPreco() < menorPreco){
                menorPreco = p.getPreco();
                produtoMaisBarato = p;
            }
        }
    }
    return produtoMaisBarato;
}

public double calcularMediaPrecos(){
    if(estoqueProdutosMap.isEmpty()) return 0.0;

    double soma = 0.0;
    int quantidade = 0;

    for(Produto p : estoqueProdutosMap.values()){
        soma += p.getPreco();
        quantidade++;
    }
    return soma/quantidade;
}

public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto produtoMaiorValorTotal = null;

    double maiorValorTotal = Double.MIN_VALUE;

    if(!estoqueProdutosMap.isEmpty()){
        for(Produto p : estoqueProdutosMap.values()){
            double valorTotal = p.getPreco() * p.getQuantidade();

            if(valorTotal > maiorValorTotal){
                maiorValorTotal = valorTotal;
                produtoMaiorValorTotal = p;
            }
        }
    }
    return produtoMaiorValorTotal;
}

public static void main(String[] args) {
    // Criando o estoque de produtos
    EstoqueProdutos estoque = new EstoqueProdutos();

    // Adicionando produtos ao estoque
    estoque.adicionarProduto(1L, "Notebook", 10, 5000.0);
    estoque.adicionarProduto(2L, "Smartphone", 15, 3000.0);
    estoque.adicionarProduto(3L, "TV", 8, 4500.0);
    estoque.adicionarProduto(4L, "Tablet", 20, 2000.0);

    // Exibir produtos cadastrados
    System.out.println("Lista de produtos no estoque:");
    estoque.exibirProdutos();

    // Obtendo e exibindo o produto mais caro
    System.out.println("\nProduto mais caro: " + estoque.obterProdutoMaisCaro());

    // Obtendo e exibindo o produto mais barato
    System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());

    // Calculando e exibindo a média dos preços dos produtos
    System.out.println("Média dos preços dos produtos: " + estoque.calcularMediaPrecos());

    // Calculando e exibindo o valor total do estoque
    System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());

    // Obtendo e exibindo o produto com maior valor total no estoque
    System.out.println("Produto com maior valor total no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
}
}
