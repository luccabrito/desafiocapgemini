package Entities;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrama {

    /**
     * Método utilizado para criar um HashMap contendo todas as substrings de uma string
     * e a frequência com que cada uma delas aparece.
     * @param texto String que você deseja repartir em substrings
     * @return Hashmap contendo todas as substrings e a frequência com que cada uma delas aparece.
     */

    public static HashMap substring(String texto) {
        HashMap<String, Integer> map= new HashMap<>();

        for(int i = 0; i < texto.length(); i++){
            for(int j = i; j < texto.length(); j++){
                char[] charArray = texto.substring(i, j+1).toCharArray();
                Arrays.sort(charArray);
                String substringOrdenada = new String(charArray);
                if (map.containsKey(substringOrdenada))
                    map.put(substringOrdenada, map.get(substringOrdenada)+1);
                else
                    map.put(substringOrdenada, 1);
            }
        }
        return map;
    }

    /**
     * Método para contar o total de anagramas, recebendo como parâmetro o HashMap criado pelo método acima.
     * Ao final do método, é necessário aplicar a fórmula de combinação, para garantir que estamos contando
     * cada par apenas uma vez.
     * @param map HashMap criado pelo método acima, contendo todas as substrings de uma string e a frequência
     * com que cada uma delas aparece.
     * @return O total de pares de anagramas em uma determinada string.
     */

    public static int totalAnagramas(HashMap<String, Integer> map) {
        int totalDeParesDeAnagramas = 0;
        for(String key : map.keySet()) {
            int n = map.get(key);
            totalDeParesDeAnagramas += (n * (n-1))/2;
        }
        return totalDeParesDeAnagramas;
    }
}
