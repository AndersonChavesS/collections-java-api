package collection.java.set.Ordenacao.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(Long matricula, String nome, double nota) {
        alunoSet.add(new Aluno(matricula, nome, nota));
    }

    public boolean removerAluno(long matricula) {
        return alunoSet.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno(101L, "João", 8.5);
        gerenciadorAlunos.adicionarAluno(102L, "Ana", 9.0);
        gerenciadorAlunos.adicionarAluno(103L, "Carlos", 7.5);

        System.out.println("\nAlunos em ordem alfabética: \n" + gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println("\nAlunos em ordem de nota: \n" + gerenciadorAlunos.exibirAlunosPorNota());

        System.out.println("\nTodos os alunos:");
        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(102L);
        System.out.println("\nApós remover aluno: ");
        gerenciadorAlunos.exibirAlunos();
    }
}
