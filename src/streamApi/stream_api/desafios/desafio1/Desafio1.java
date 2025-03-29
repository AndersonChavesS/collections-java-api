package streamApi.stream_api.desafios.desafio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream().sorted(Integer::compareTo).collect(Collectors.toList());

        System.out.println(numerosOrdenados);
    }
}
