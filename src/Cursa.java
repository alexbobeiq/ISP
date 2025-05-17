import java.time.LocalDateTime;
import java.time.LocalTime;

public class Cursa {
    private int cursaId;
    private String punctDePlecare;
    private String destinatie;
    private StatusCursa status;
    private LocalTime durata;
    private LocalTime timpPlecare;
    private LocalDateTime timpDestinatie;
    private Pasager pasager;
    private Sofer sofer;

    public StatusCursa getStatus() {
        return status;
    }

    public Cursa(int cursaId, String punctDePlecare, String destinatie) {
        this.cursaId = cursaId;
        this.punctDePlecare = punctDePlecare;
        this.destinatie = destinatie;
        this.status = StatusCursa.solicitata;
    }

    public void pornesteCursa() {
        this.status = StatusCursa.in_desfasurare;
        this.timpPlecare = LocalTime.now();
    }

    public void finalizeazaCursa() {
        this.status = StatusCursa.finalizata;
        this.timpDestinatie = LocalDateTime.now();
    }

    public LocalTime calculeazaDurata() {
        if (timpPlecare != null && timpDestinatie != null) {
            durata = LocalTime.ofSecondOfDay(timpDestinatie.toLocalTime().toSecondOfDay() - timpPlecare.toSecondOfDay());
        }
        return durata;
    }

    public float calculeazaSuma() {
        final float tarifPerKm = 2.5f; // tarif fix per kilometru
        int distantaEstimata = punctDePlecare.length() + destinatie.length(); // simulare distanță
        return distantaEstimata * tarifPerKm;
    }

    // Getters and setters

    public Pasager getPasager() {
        return pasager;
    }

    public Sofer getSofer() {
        return sofer;
    }

    public void setPasager(Pasager pasager) {
        this.pasager = pasager;
    }

    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }
}
