public class Kredit extends Hesab {
    Kredit(double balans) {
        super(balans);
    }

    @Override
    public void faizHesabla() {
        double kredit = balans * 0.18;
        System.out.println("Kredit faizi: " + kredit + " AZN");
    }
}
