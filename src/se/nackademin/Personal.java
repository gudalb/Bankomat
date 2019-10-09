package se.nackademin;

public class Personal extends Personuppgifter {
    private double monthlySallary;

    public Personal (String name, String adress) {
        super(name,adress);
        Lists.personal.add(this);
    }

    public Personal (String name, String adress, double monthlySallary) {
        super(name,adress);
        this.monthlySallary = monthlySallary;
        Lists.personal.add(this);
    }

    public void setSallary (double sallary) {
        this.monthlySallary = sallary;
    }
    public double getSallary () {
        return monthlySallary;
    }
}
