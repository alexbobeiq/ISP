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

    public List<String> getPermisiuni() {
        return permisiuni;
    }

    // Getters and setters
}