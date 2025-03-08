package collection.java.map.Ordenacao.AgendaDeEventos;

import java.util.Objects;

public class Evento {
    private final String nomeEvento;
    private final String nomeAtracao;

    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = Objects.requireNonNull(nomeEvento, "O nome do evento não pode ser vazio.");
        this.nomeAtracao = Objects.requireNonNull(nomeAtracao, "O nome da atração não pode ser vazio.");
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    @Override
    public String toString() {
        return String.format("Evento{nome = '%s', atração = '%s'}", nomeEvento, nomeAtracao);
    }

    @Override
    public boolean equals(Object e) {
        if (this == e)
            return true;
        if (e == null || getClass() != e.getClass())
            return false;

        Evento evento = (Evento) e;
        return nomeEvento.equals(evento.nomeEvento) && nomeAtracao.equals(evento.nomeAtracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeEvento, nomeAtracao);
    }

}
