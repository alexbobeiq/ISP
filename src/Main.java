public class Main {
    public static void main(String[] args) {
        // Pasager 1
        Pasager pasager1 = new Pasager();
        pasager1.setId(1);
        pasager1.setNume("Ion Popescu");
        pasager1.setEmail("ion.popescu@gmail.com");
        pasager1.setNrTelefon("0712345678");

        // Pasager 2
        Pasager pasager2 = new Pasager();
        pasager2.setId(2);
        pasager2.setNume("Ana Georgescu");
        pasager2.setEmail("ana.georgescu@yahoo.com");
        pasager2.setNrTelefon("0723456789");

        // Șofer
        Sofer sofer = new Sofer();
        sofer.setId(100);
        sofer.setNume("Vasile Ionescu");
        sofer.setEmail("vasile@ride.com");
        sofer.setNrTelefon("0700000000");
        sofer.seteazaDisponibil(true);

        // Vehicul
        Vehicul vehicul = new Vehicul();
        vehicul.setNrMatriculare("B123XYZ");
        vehicul.setMarca("Dacia");
        vehicul.setModel("Logan");
        vehicul.setAn(2018);
        vehicul.setCuloare("Gri");
        vehicul.setSerieSasiu("SH987654321");

        sofer.adaugaVehicul(vehicul);

        // CURSA 1
        Cursa cursa1 = new Cursa(1, "Str. Aviatorilor", "Piața Victoriei");
        cursa1.setPasager(pasager1);
        cursa1.setSofer(sofer);

        cursa1.pornesteCursa();
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        cursa1.finalizeazaCursa();

        float suma1 = cursa1.calculeazaSuma();
        System.out.println("Cursa 1 - Suma: " + suma1 + " lei");

        Plata plata1 = new Plata(101, suma1, mPlata.card, pasager1.getNume(), Monede.lei);
        if (plata1.efectueazaPlata()) {
            System.out.println("Plata 1 efectuată cu succes.");
        }

        pasager1.adaugaRating(sofer, 4); // Rating pasager 1

        // CURSA 2
        Cursa cursa2 = new Cursa(2, "Universitate", "Piața Unirii");
        cursa2.setPasager(pasager2);
        cursa2.setSofer(sofer);

        cursa2.pornesteCursa();
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        cursa2.finalizeazaCursa();

        float suma2 = cursa2.calculeazaSuma();
        System.out.println("Cursa 2 - Suma: " + suma2 + " lei");

        Plata plata2 = new Plata(102, suma2, mPlata.cash, pasager2.getNume(), Monede.lei);
        if (plata2.efectueazaPlata()) {
            System.out.println("Plata 2 efectuată cu succes.");
        }

        pasager2.adaugaRating(sofer, 5); // Rating pasager 2

        // Media ratingului
        System.out.printf("Media ratingurilor primite de șofer: %.2f\n", sofer.getMedieRating());
    }
}
