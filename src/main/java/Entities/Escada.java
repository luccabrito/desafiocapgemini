package Entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Escada {

    private int altura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * O método abaixo, definirAltura(), decide se o valor inserido pelo usuário para a altura da escada
     * é válido. Se for colocado um valor inteiro negativo, é solicitado que o usuário coloque um positivo.
     * Se o input do usuário for de outro tipo que não um inteiro, é lançada uma InputMismatchException, e
     * solicita-se ao usuário que rode novamente o código, inserindo um valor numérico inteiro e positivo
     * para a altura da escada.
     */

    public void definirAltura() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Insira a altura desejada para a sua escada.");
        do {
            try {
                altura = sc1.nextInt();
                sc1.nextLine();
                if (altura <= 0) {
                    System.out.println("Favor inserir um valor numérico inteiro e positivo para a altura da escada.");
                }
            } catch (InputMismatchException ex) {
                System.out.print("Favor inserir um valor numérico inteiro e positivo para a altura da escada. Você deve rodar novamente o programa.");
                break;
            }
        } while (altura <= 0);
        setAltura(altura);
    }

    /**
     * O método abaixo se utiliza da classe StringBuilder, ao final transformando-a em String, para imprimir
     * a escada no terminal. Com um loop for duplo, para iterar em duas dimensões, decide se irá imprimir em cada
     * espaço um "*" ou um " " (espaço em branco). A lógica é que se a soma do valor da coluna com o valor da fileira
     * for maior ou igual que o valor da altura da escada subtraído de 1, ele deve imprimir um asterisco; caso
     * contrário, imprime um espaço em branco.
     * @param altura da escada que você deseja imprimir.
     * @return String com a escada impressa.
     */

    public String desenharEscada(int altura) {
        StringBuilder escada = new StringBuilder();
         for (int fileira = 0; fileira < altura; fileira++) {
            for (int coluna = 0; coluna < altura; coluna++) {
                if (fileira + coluna >= altura - 1) {
                    escada.append("*");
                }
                else {
                    escada.append(" ");
                }
            }
            if (fileira != altura - 1) {
                escada.append("\n");
            }
        }
         return escada.toString();
    }
}