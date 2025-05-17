public class Utilizator {
    private int id;
    private String nume;
    private String email;
    private String nrTelefon;
    private String SSN;

    public void actualizeazaEmail(String nouEmail) {
        this.email = nouEmail;
    }

    public boolean verificaTelefon() {
        // Exemplu simplu de verificare: lungimea să fie 10 caractere
        return nrTelefon != null && nrTelefon.matches("\\d{10}");
    }

    // Getters și Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getNrTelefon() { return nrTelefon; }
    public void setNrTelefon(String nrTelefon) { this.nrTelefon = nrTelefon; }

    public String getSSN() { return SSN; }
    public void setSSN(String SSN) { this.SSN = SSN; }
}
