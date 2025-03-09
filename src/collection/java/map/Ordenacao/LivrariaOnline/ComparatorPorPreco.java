package collection.java.map.Ordenacao.LivrariaOnline;

import java.util.*;

public class ComparatorPorPreco implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return Double.compare(l1.getPreco(), l2.getPreco());
    }
}
