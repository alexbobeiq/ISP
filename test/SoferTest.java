import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SoferTest {
    @Test
    public void testAdaugaVehicul() {
        Sofer sofer = new Sofer();
        Vehicul vehicul1 = new Vehicul();
        vehicul1.setNrMatriculare("B123ABC");

        Vehicul vehicul2 = new Vehicul();
        vehicul2.setNrMatriculare("CJ456XYZ");

        sofer.adaugaVehicul(vehicul1);
        sofer.adaugaVehicul(vehicul2);

        List<Vehicul> vehicule = sofer.getVehicule();
        assertEquals(2, vehicule.size());
        assertEquals("B123ABC", vehicule.get(0).getNrMatriculare());
        assertEquals("CJ456XYZ", vehicule.get(1).getNrMatriculare());
    }

    @Test
    public void testAdaugaUnRating() {
        Sofer s = new Sofer();
        s.adaugaRating(5);
        assertEquals(5.0f, s.getMedieRating(), 0.01);
    }

    @Test
    public void testAdaugaMaiMulteRatinguri() {
        Sofer s = new Sofer();
        s.adaugaRating(5);
        s.adaugaRating(3);
        s.adaugaRating(4);
        assertEquals(4.0f, s.getMedieRating(), 0.01);
    }
}
