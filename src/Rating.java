import java.time.LocalDateTime;

public class Rating {
    private int ratingId;
    private vRating valoare;
    private String comentariu;
    private LocalDateTime data;

    public Rating(int ratingId, vRating valoare, String comentariu, LocalDateTime data) {
        this.ratingId = ratingId;
        this.valoare = valoare;
        this.comentariu = comentariu;
        this.data = data;
    }

    public void afiseazaRating() {
        System.out.println("Rating ID: " + ratingId + ", Valoare: " + valoare + ", Comentariu: " + comentariu + ", Data: " + data);
    }

    public boolean valideazaRating() {
        return valoare != null && data != null && data.isBefore(LocalDateTime.now());
    }

    // Getters and setters
}
