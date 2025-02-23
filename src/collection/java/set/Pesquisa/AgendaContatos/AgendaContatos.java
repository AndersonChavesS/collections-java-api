package collection.java.set.Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Anderson", 1111111111);
        agendaContatos.adicionarContato("Camila", 333333333);
        agendaContatos.adicionarContato("Anderson Chaves", 222222222);
        agendaContatos.adicionarContato("Anderson Souza", 123456789);
        agendaContatos.adicionarContato("Maria Silva", 12345678);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Anderson"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 55555555));

        agendaContatos.exibirContatos();
    }
}
