public class Vehicul {
    private String nrMatriculare;
    private String marca;
    private String model;
    private int an;
    private String culoare;
    private String serieSasiu;

    public Vehicul() {
        nrMatriculare = "";
        marca = "";
        model = "";
        an = 0;
        culoare = "";
        serieSasiu = "";
    }
    public Vehicul(String nrMatriculare, String marca, String model, int an, String culoare, String serieSasiu ) {
        this.nrMatriculare= nrMatriculare;
        this.marca= marca;
        this.model= model;
        this.an= an;
        this.culoare= culoare;
        this.serieSasiu= serieSasiu;
    }

    public boolean verificaDisponibilitate() {
        // Exemplu simplu: verificăm dacă seria de șasiu este setată
        return serieSasiu != null && !serieSasiu.isEmpty();
    }

    public void actualizeazaCuloare(String nouaCuloare) {
        this.culoare = nouaCuloare;
    }

    // Getters și Setters
    public String getNrMatriculare() {
        return nrMatriculare;
    }

    public void setNrMatriculare(String nrMatriculare) {
        this.nrMatriculare = nrMatriculare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getSerieSasiu() {
        return serieSasiu;
    }

    public void setSerieSasiu(String serieSasiu) {
        this.serieSasiu = serieSasiu;
    }

    public void afisare() {
        System.out.println("=== Informații Vehicul ===");
        System.out.println("Număr înmatriculare: " + nrMatriculare);
        System.out.println("Marcă: " + marca);
        System.out.println("Model: " + model);
        System.out.println("An fabricație: " + an);
        System.out.println("Culoare: " + culoare);
        System.out.println("Serie șasiu: " + (serieSasiu != null ? serieSasiu : "Nespecificată"));
    }

}