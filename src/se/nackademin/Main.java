package se.nackademin;

public class Main {

    public static void main(String[] args) {

        Kund klas = new Kund("Klas", "Gatan 1");
        Kund peter = new Kund("Peter", "Gatan 11");
        Personal greger = new Personal("Kalle", "Gatan 55");
        Personal bob = new Personal("Bob", "Gatan 555");

        klas.addKonto(1000,.25);
        klas.addKonto(102,.25);
        peter.addLån(100000,0.25, greger);

        Lists.printLists();


    }
}
