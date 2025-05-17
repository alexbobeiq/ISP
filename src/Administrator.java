import java.util.ArrayList;
import java.util.List;

public class Administrator {
    private int adminId;
    private String nume;
    private String email;
    private List<String> permisiuni;

    public Administrator(int adminId, String nume, String email) {
        this.adminId = adminId;
        this.nume = nume;
        this.email = email;
        this.permisiuni = new ArrayList<>();
    }

    public void adaugaPermisiune(String permisiune) {
        if (!permisiuni.contains(permisiune)) {
            permisiuni.add(permisiune);
        }
    }

    public void stergeUtilizator(Utilizator utilizator) {
        System.out.println("Utilizatorul cu ID " + utilizator.getId() + " a fost șters de administratorul " + adminId);
        // Ar trebui să existe un sistem de gestionare a utilizatorilor pentru a șterge efectiv
    }

    // Getters and setters
}