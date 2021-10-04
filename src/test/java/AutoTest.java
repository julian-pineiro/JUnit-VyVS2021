import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AutoTest {
    Auto auto = new Auto(60);

    @Test
    public void acelerarTest(){
        int velocidadAntes = auto.getVelocidad();
        int result = auto.acelerar(10);
        assertEquals(velocidadAntes, result-10);
    }

    @Test
    public void llenarTanqueLlenoTest(){
        auto.llenarTanque();
        assertEquals(auto.getTanque(), auto.getNafta());
    }

    @Test
    public void llenarTanqueNoLlenoTest(){
        auto.consumir(10);
        auto.llenarTanque();
        assertEquals(auto.getTanque(), auto.getNafta());
    }
    @Test
    public void consumirMenosTest(){
        int aConsumir = auto.getTanque()-1;
        auto.consumir(aConsumir);
        assertEquals(aConsumir, auto.getTanque()-auto.getNafta());
    }

    @Test
    public void consumirTodoTest(){
        int aConsumir = auto.getTanque()+10;
        auto.consumir(aConsumir);
        assertEquals(auto.getNafta(), 0);
    }
}
