package Modul4HW10.HW5;

public class Depozit extends Hesab {

    Depozit(double balans) {
        super(balans);
    }

    @Override
    public void faizHesabla() {
        double faiz = balans * 0.08;
        System.out.println("Modul4HW10.HW5.Depozit faizi: " + faiz + " AZN");
    }
}

