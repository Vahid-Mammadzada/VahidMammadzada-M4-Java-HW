public class Main {
    public static void main(String[] args) {

        Depozit d = new Depozit(2000);
        d.balansGoster();
        d.faizHesabla();

        System.out.println();

        Kredit k = new Kredit(4000);
        k.balansGoster();
        k.faizHesabla();

        // Hesab h = new Hesab(1000); java: Hesab is abstract; cannot be instantiated

    }
}
