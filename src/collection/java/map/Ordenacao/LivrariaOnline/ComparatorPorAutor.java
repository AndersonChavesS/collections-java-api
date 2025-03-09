package collection.java.map.Ordenacao.LivrariaOnline;

import java.util.*;

public class ComparatorPorAutor implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}
