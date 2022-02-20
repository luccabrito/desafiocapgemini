
import Entities.Anagrama;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramaTest {

    private final Anagrama _anagrama = new Anagrama();

    @Test
    public void charArrayOrdenadoOrdemAlfabetica1() {
        String texto = "mel";
        char[] charArray = texto.toCharArray();
        Arrays.sort(charArray);
        String actualResult = new String(charArray);
        Assertions.assertEquals("elm", actualResult);
    }

    @Test
    public void charArrayOrdenadoOrdemAlfabetica2() {
        String texto = "pernambuco";
        char[] charArray = texto.toCharArray();
        Arrays.sort(charArray);
        String actualResult = new String(charArray);
        Assertions.assertEquals("abcemnopru", actualResult);
    }

    @Test
    public void anagramasContadosCorretamente1(){
        String texto = "ovo";
        HashMap<String, Integer> hashMap = Anagrama.substring(texto);
        int totalAnagramas = Anagrama.totalAnagramas(hashMap);
        Assertions.assertEquals(2, totalAnagramas);
    }

    @Test
    public void anagramasContadosCorretamente2(){
        String texto = "ifailuhkqq";
        HashMap<String, Integer> hashMap = Anagrama.substring(texto);
        int totalAnagramas = Anagrama.totalAnagramas(hashMap);
        Assertions.assertEquals(3, totalAnagramas);
    }

    @Test
    public void anagramasContadosCorretamente3(){
        String texto = "serpentinas";
        HashMap<String, Integer> hashMap = Anagrama.substring(texto);
        int totalAnagramas = Anagrama.totalAnagramas(hashMap);
        Assertions.assertEquals(6, totalAnagramas);
    }
}
