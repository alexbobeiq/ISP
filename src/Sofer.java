import java.util.ArrayList;
import java.util.List;

public class Sofer extends Utilizator {
    private List<Vehicul> vehicule = new ArrayList<>();
    private boolean disponibil;
    private List<Integer> ratingPrimit = new ArrayList<>();
    private float medieRating;
    private List<Cursa> curse = new ArrayList<>();


    public Sofer() {

    }
    public Sofer(int id, String nume, String email, String nrTelefon, String SSN) {
        setId(id);
        setNume(nume);
        setEmail(email);
        setNrTelefon(nrTelefon);
        setSSN(SSN);
        this.vehicule = new ArrayList<>();
        this.disponibil = true; // sau false, în funcție de preferință
        this.ratingPrimit = new ArrayList<>();
        this.medieRating = 0;
    }

    public void seteazaDisponibil(boolean disponibil) {
        this.disponibil = disponibil;
    }

    public float calculeazaMedieRating() {
        if (ratingPrimit.isEmpty()) return 0;
        int suma = 0;
        for (int rating : ratingPrimit) {
            suma += rating;
        }
        medieRating = (float) suma / ratingPrimit.size();
        return medieRating;
    }

    public void adaugaRating(int rating) {
        ratingPrimit.add(rating);
        calculeazaMedieRating();
    }

    // Getters și Setters pentru vehicule
    public List<Vehicul> getVehicule() {
        return vehicule;
    }

    public void setVehicule(List<Vehicul> vehicule) {
        this.vehicule = vehicule;
    }

    public void adaugaVehicul(Vehicul vehicul) {
        vehicule.add(vehicul);
    }

    public void eliminaVehicul(Vehicul vehicul) {
        vehicule.remove(vehicul);
    }

    public boolean isDisponibil() {
        return disponibil;
    }

    public float getMedieRating() {
        return medieRating;
    }

    public void afisare() {
        System.out.println("=== Informații Șofer ===");
        System.out.println("ID: " + getId());
        System.out.println("Nume: " + getNume());
        System.out.println("Email: " + getEmail());
        System.out.println("Număr de telefon: " + getNrTelefon());
        System.out.println("SSN: " + getSSN());

        System.out.println("Disponibil: " + (disponibil ? "Da" : "Nu"));

        if (vehicule.isEmpty()) {
            System.out.println("Vehicule: Niciun vehicul asociat");
        } else {
            System.out.println("Vehicule:");
            for (Vehicul v : vehicule) {
                v.afisare();
            }
        }

        System.out.println("Medie rating: " + medieRating);
        System.out.println("Ratinguri primite: " + (ratingPrimit.isEmpty() ? "Niciun rating" : ratingPrimit));
    }
}
