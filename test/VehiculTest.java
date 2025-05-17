import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculTest {

    @Test
    public void testVehiculDisponibil() {
        Vehicul v = new Vehicul();
        v.setSerieSasiu("ABC1234567890");
        assertTrue(v.verificaDisponibilitate());
    }

    @Test
    public void testVehiculIndisponibil() {
        Vehicul v = new Vehicul();
        v.setSerieSasiu("");
        assertFalse(v.verificaDisponibilitate());
    }
}
