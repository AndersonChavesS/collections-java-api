package main.java.list.Pesquisa.CatalogoLivros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(int anoPublicacao, String autor, String titulo) {
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "anoPublicacao=" + anoPublicacao +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
