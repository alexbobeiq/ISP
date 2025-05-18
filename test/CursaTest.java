import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CursaTest {
    private Sofer sofer;
    private Pasager pasager;
    private Cursa cursa;

    @BeforeEach
    public void setup() {
        Vehicul vehicul = new Vehicul();
        vehicul.setNrMatriculare("B123XYZ");
        vehicul.setMarca("Dacia");
        vehicul.setModel("Logan");
        vehicul.setAn(2018);
        vehicul.setCuloare("Gri");
        vehicul.setSerieSasiu("SH987654321");

        sofer = new Sofer();
        sofer.setId(1);
        sofer.setNume("Test Sofer");
        sofer.adaugaVehicul(vehicul);

        pasager = new Pasager();
        pasager.setId(2);
        pasager.setNume("Test Pasager");

        cursa = new Cursa(101, "Universitate", "Piața Unirii", vehicul, pasager);
        cursa.setSofer(sofer);
    }

    @Test
    public void testAsociereSoferPasagerLaCursa() {
        assertEquals(sofer, cursa.getSofer());
        assertEquals(pasager, cursa.getPasager());
    }

    @Test
    public void testPornireSiFinalizareCursa() {
        cursa.pornesteCursa();
        assertEquals(StatusCursa.in_desfasurare, cursa.getStatus());

        cursa.finalizeazaCursa();
        assertEquals(StatusCursa.finalizata, cursa.getStatus());
    }

    @Test
    public void testCalculeazaSuma() {
        float suma = cursa.calculeazaSuma();
        assertTrue(suma > 0, "Suma ar trebui să fie mai mare decât zero.");
    }

    @Test
    public void testAdaugareRatingSiCalculMedie() {
        pasager.adaugaRating(sofer, 4);
        pasager.adaugaRating(sofer, 5);

        float medie = sofer.calculeazaMedieRating();
        assertEquals(4.5f, medie, 0.01);
    }
}
