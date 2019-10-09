package se.nackademin;

public class Konto {
    private double kapital;
    private double interestRate;

    public Konto(double startKap, double interestRate) {
        this.kapital = startKap;
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Kapital: " + kapital + " Ränta: " + interestRate;
    }
}
