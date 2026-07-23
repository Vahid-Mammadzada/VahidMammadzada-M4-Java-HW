public class Depozit extends Hesab {

    Depozit(double balans) {
        super(balans);
    }

    @Override
    public void faizHesabla() {
        double faiz = balans * 0.08;
        System.out.println("Depozit faizi: " + faiz + " AZN");
    }
}

