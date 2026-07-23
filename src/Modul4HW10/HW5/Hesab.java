package Modul4HW10.HW5;

public abstract class Hesab {

    double balans;

    Hesab(double balans) {
        this.balans=balans;
    }

    public void balansGoster() {
        System.out.println("Balans: " + balans + " AZN");
    }
        public abstract void faizHesabla();
    }
