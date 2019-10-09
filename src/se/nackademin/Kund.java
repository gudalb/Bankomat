package se.nackademin;
import java.util.*;

public class Kund extends Personuppgifter {

    List<Konto> konton = new ArrayList<>();
    List<Lån> lån = new ArrayList<>();

    public Kund(String name, String adress) {
        super(name, adress);
        Lists.kunder.add(this);
    }

    public void addKonto(double kapital, double interestRate) {
        Konto k = new Konto(kapital, interestRate);
        konton.add(k);
    }

    public void addLån(double belopp, double interestRate, Personal beviljatAv) {
        Lån l = new Lån(belopp, interestRate, beviljatAv);
        lån.add(l);
    }

    public void printKonton () {
        for (int i = 0;i < konton.size();i++) {
            System.out.println("\t Konto " + (i+1) + ": " + konton.get(i));
        }
    }

    public void printLån () {
        for (int i = 0;i < lån.size();i++) {
            System.out.println("\t Lån " + (i+1) + ": " + lån.get(i));
        }
    }

}