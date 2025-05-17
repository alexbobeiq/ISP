import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilizatorTest {

    @Test
    public void testTelefonValid() {
        Utilizator u = new Utilizator();
        u.setNrTelefon("0712345678");
        assertTrue(u.verificaTelefon());
    }

    @Test
    public void testTelefonInvalid() {
        Utilizator u = new Utilizator();
        u.setNrTelefon("12345");
        assertFalse(u.verificaTelefon());
    }

    @Test
    public void testActualizeazaEmail() {
        Utilizator u = new Utilizator();
        u.setEmail("vechi@email.com");
        u.actualizeazaEmail("nou@email.com");
        assertEquals("nou@email.com", u.getEmail());
    }
}
