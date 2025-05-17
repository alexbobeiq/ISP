import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pasager extends Utilizator {
    private String metodaPlata;
    private Map<Sofer, Integer> ratingOferit = new HashMap<>();
    private List<Cursa> curse = new ArrayList<>();


    public void adaugaRating(Sofer sofer, int valoare) {
        ratingOferit.put(sofer, valoare);
        sofer.adaugaRating(valoare);
    }

    public void alegeMetodaPlata(String metoda) {
        this.metodaPlata = metoda;
    }

    // Getter
    public String getMetodaPlata() {
        return metodaPlata;
    }
}
