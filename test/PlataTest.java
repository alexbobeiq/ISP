import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlataTest {

    @Test
    public void testPlataValida() {
        Plata p = new Plata(1, 100.0f, mPlata.card, "Ion", Monede.lei);
        assertTrue(p.efectueazaPlata());
    }

    @Test
    public void testPlataInvalidaFaraNume() {
        Plata p = new Plata(1, 100.0f, mPlata.card, null, Monede.lei);
        assertFalse(p.efectueazaPlata());
    }

    @Test
    public void testConversieMoneda() {
        Plata p = new Plata(1, 100.0f, mPlata.cash, "Maria", Monede.lei);
        float sumaConvertita = p.convertesteMoneda(Monede.euro);
        assertEquals(110.0f, sumaConvertita, 0.01);
    }
}
