package se.nackademin;
import java.lang.reflect.Array;
import java.util.*;

public class Lån {
    private double belopp;
    private double interestRate;
    private Personal vemBeviljat;
    private List<Double> historikInterestRate = new ArrayList<>();
    private List<Personal> historikBeviljat = new ArrayList<>();

    public Lån (double belopp, double interestRate, Personal vemBeviljat) {
        this.belopp = belopp;
        this.interestRate = interestRate;
        this.vemBeviljat = vemBeviljat;
        this.historikInterestRate.add(interestRate);
        this.historikBeviljat.add(vemBeviljat);
    }

    public void setInterestRate (double newInterestRate, Personal vemBeviljat) {
        this.historikInterestRate.add(newInterestRate);
        this.historikBeviljat.add(vemBeviljat);
        this.interestRate = newInterestRate;
    }

    @Override
    public String toString() {
        return "Belopp: " + belopp + " Ränta: " + interestRate + " Beviljat av: " + vemBeviljat.getName();
    }
}
