
import Entities.Escada;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EscadaTest {
    private final Escada _escada = new Escada();


    @Test
    public void escadaTest() {
        String actualResult = _escada.desenharEscada(0);
        Assertions.assertEquals("", actualResult);
    }

    @Test
    public void escadaTest2() {
        String actualResult = _escada.desenharEscada(1);
        Assertions.assertEquals("*", actualResult);
    }

    @Test
    public void escadaTest3() {
        String actualResult = _escada.desenharEscada(4);
        Assertions.assertEquals("   *\n" + "  **\n" + " ***\n" + "****", actualResult);
    }

    @Test
    public void escadaTest4() {
        String actualResult = _escada.desenharEscada(20);
        Assertions.assertEquals("                   *\n" +
                "                  **\n" +
                "                 ***\n" +
                "                ****\n" +
                "               *****\n" +
                "              ******\n" +
                "             *******\n" +
                "            ********\n" +
                "           *********\n" +
                "          **********\n" +
                "         ***********\n" +
                "        ************\n" +
                "       *************\n" +
                "      **************\n" +
                "     ***************\n" +
                "    ****************\n" +
                "   *****************\n" +
                "  ******************\n" +
                " *******************\n" +
                "********************", actualResult);
    }

}
