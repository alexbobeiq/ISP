import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AdministratorTest {

    private Administrator admin;

    @BeforeEach
    public void setUp() {
        admin = new Administrator(1, "Alex", "alex@email.com");
    }

    @Test
    public void testAdaugaPermisiune() {
        admin.adaugaPermisiune("EDIT_USER");
        admin.adaugaPermisiune("DELETE_USER");
        admin.adaugaPermisiune("EDIT_USER"); // duplicat

        List<String> permisiuni = admin.getPermisiuni();

        assertEquals(2, permisiuni.size(), "Permisiunile duplicate nu trebuie adăugate");
        assertTrue(permisiuni.contains("EDIT_USER"));
        assertTrue(permisiuni.contains("DELETE_USER"));
    }


}
