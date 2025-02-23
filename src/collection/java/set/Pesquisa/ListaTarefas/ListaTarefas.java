package collection.java.set.Pesquisa.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefas.removeIf(t -> t.getDescricao().equals(descricao));
    }

    public void exibirTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia.");
        } else {
            tarefas.forEach(System.out::println);
        }
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (t.isConcluida()) {
                concluidas.add(t);
            }
        }
        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (!t.isConcluida()) {
                pendentes.add(t);
            }
        }
        return pendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equals(descricao)) {
                t.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equals(descricao)) {
                t.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        tarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer exercícios");
        lista.contarTarefas();
        lista.exibirTarefas();

        lista.marcarTarefaConcluida("Estudar Java");
        System.out.println("Tarefas concluídas: " + lista.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + lista.obterTarefasPendentes());

        lista.removerTarefa("Fazer exercícios");
        lista.exibirTarefas();

        lista.limparListaTarefas();
        lista.exibirTarefas();
    }
}
