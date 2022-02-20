package Applications;

import java.util.HashMap;
import java.util.Scanner;
import Entities.Anagrama;

public class AnagramaMain {
    public static void main(String[] args) {
        System.out.println("Digite a palavra que você deseja analisar os substrings para saber se formam anagramas.");
        Scanner sc1 = new Scanner(System.in);
        String texto = sc1.nextLine();
        HashMap<String, Integer> map = Anagrama.substring(texto);
        System.out.println(Anagrama.totalAnagramas(map));
    }
}