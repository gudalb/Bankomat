package se.nackademin;

public class Personuppgifter {
    private String name;
    private String adress;

    Personuppgifter(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }
    public String getAdress() {
        return adress;
    }
    public void printUppgifter () {
        System.out.println("Namn: " + getName() + " Adress: " + getAdress());
    }
}
