public class Tapsiriq4 {

    public static void main(String[] args) {

        try {
            nagdCixar(1500);
        } catch (LimitKecildiException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        System.out.println("------------------");

        try {
            nagdCixar(3000);
        } catch (LimitKecildiException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }

    static void nagdCixar(double meblegh) throws LimitKecildiException {
        if (meblegh > 2000) {
            throw new LimitKecildiException("Gündəlik limit aşıldı: " + meblegh + " AZN (limit: 2000 AZN)");
        }
        System.out.println("Nağd çıxarıldı: " + meblegh + " AZN");
    }
}
class LimitKecildiException extends Exception {
    public LimitKecildiException(String mesaj) {
        super(mesaj);
    }
}