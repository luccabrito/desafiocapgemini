
import Entities.SenhaForte;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SenhaForteTest {
    private final SenhaForte _senha = new SenhaForte();

    @Test
    public void requisitosAtingidosTest1() {
        int actualResult = _senha.totalRequisitosAtingidos("      ");
        Assertions.assertEquals(0, actualResult);
    }

    @Test
    public void requisitosAtingidosTest2() {
        int actualResult = _senha.totalRequisitosAtingidos("aaaaaa");
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    public void requisitosAtingidosTest3() {
        int actualResult = _senha.totalRequisitosAtingidos("Ja");
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    public void requisitosAtingidosTest4() {
        int actualResult = _senha.totalRequisitosAtingidos("3KaYuP5");
        Assertions.assertEquals(3, actualResult);
    }

    @Test
    public void requisitosAtingidosTest5() {
        int actualResult = _senha.totalRequisitosAtingidos("%Ja4mo$#97");
        Assertions.assertEquals(4, actualResult);
    }

    @Test
    public void digitosNecessariosTest1() {
        int actualResult = _senha.digitosNecessariosParaAtingirSenhaForte("kakakaka", _senha.totalRequisitosAtingidos("kakakaka"));
        Assertions.assertEquals(3, actualResult);
    }

    @Test
    public void digitosNecessariosTest2() {
        int actualResult = _senha.digitosNecessariosParaAtingirSenhaForte("    ", _senha.totalRequisitosAtingidos("    "));
        Assertions.assertEquals(4, actualResult);
    }

    @Test
    public void digitosNecessariosTest3() {
        int actualResult = _senha.digitosNecessariosParaAtingirSenhaForte("JJJ%54", _senha.totalRequisitosAtingidos("JJJ%54"));
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    public void digitosNecessariosTest4() {
        int actualResult = _senha.digitosNecessariosParaAtingirSenhaForte("#Juy45$", _senha.totalRequisitosAtingidos("#Juy45$"));
        Assertions.assertEquals(0, actualResult);
    }

    @Test
    public void digitosNecessariosTest5() {
        int actualResult = _senha.digitosNecessariosParaAtingirSenhaForte("", _senha.totalRequisitosAtingidos(""));
        Assertions.assertEquals(6, actualResult);
    }
}