import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasagerTest {

    private Pasager pasager;
    private Sofer sofer;

    @BeforeEach
    public void setUp() {
        pasager = new Pasager();
        pasager.setId(101);
        pasager.setNume("Maria");

        sofer = new Sofer();
        sofer.setId(201);
        sofer.setNume("Ion");
    }

    @Test
    public void testAlegeMetodaPlata() {
        pasager.alegeMetodaPlata("card");
        assertEquals("card", pasager.getMetodaPlata());

        pasager.alegeMetodaPlata("cash");
        assertEquals("cash", pasager.getMetodaPlata());
    }

    @Test
    public void testAdaugaRatingSofer() {
        assertEquals(0, sofer.getMedieRating());

        pasager.adaugaRating(sofer, 5);
        assertEquals(5.0f, sofer.getMedieRating());

        pasager.adaugaRating(sofer, 3);
        assertEquals(4.0f, sofer.getMedieRating(), 0.01f); // medie = (5+3)/2
    }
}
