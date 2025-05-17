public class Plata {
    private int plataId;
    private float suma;
    private mPlata metodaPlata;
    private String memberName;
    private Monede moneda;

    public Plata(int plataId, float suma, mPlata metodaPlata, String memberName, Monede moneda) {
        this.plataId = plataId;
        this.suma = suma;
        this.metodaPlata = metodaPlata;
        this.memberName = memberName;
        this.moneda = moneda;
    }

    public boolean efectueazaPlata() {
        return suma > 0 && metodaPlata != null && memberName != null;
    }

    public float convertesteMoneda(Monede nouaMoneda) {
        // Exemplu simplificat fără curs valutar real
        if (moneda == nouaMoneda) return suma;
        return suma * 1.1f; // simulare conversie
    }

    public String getSuma() {
        return String.valueOf(suma);
    }

    public String getMoneda() {
        return String.valueOf(moneda);
    }
}