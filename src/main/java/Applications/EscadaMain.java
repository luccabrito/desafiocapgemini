package Applications;
import Entities.Escada;

public class EscadaMain {
    public static void main(String[] args) {
        Escada escada1 = new Escada();
        escada1.definirAltura();
        int altura = escada1.getAltura();
        String textoFinal = escada1.desenharEscada(altura);
        System.out.print(textoFinal);
    }
}
