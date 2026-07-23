package Modul4HW10.HW5;

public class Kredit extends Hesab {
    Kredit(double balans) {
        super(balans);
    }

    @Override
    public void faizHesabla() {
        double kredit = balans * 0.18;
        System.out.println("Modul4HW10.HW5.Kredit faizi: " + kredit + " AZN");
    }
}
