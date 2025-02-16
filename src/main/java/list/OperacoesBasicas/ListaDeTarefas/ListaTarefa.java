package main.java.list.OperacoesBasicas.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }


    public int obterTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterTotalTarefas());

        listaTarefa.adicionarTarefa("Estudar programação");
        listaTarefa.adicionarTarefa("Estudar programação");
        listaTarefa.adicionarTarefa("Estudar Java");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterTotalTarefas());

        listaTarefa.removerTarefa("Estudar programação");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
