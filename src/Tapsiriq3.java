public class Tapsiriq3 {

    static void kocurmeEt(double meblegh) {
        if (meblegh <= 0 ) {
            throw new IllegalArgumentException("Məbləğ sıfır və ya mənfi ola bilməz: " + meblegh);
        }
        System.out.println("Köçürüldü: " + meblegh);
    }

    public static void main(String[] args) {
        try {
            kocurmeEt(500);
        } catch (IllegalArgumentException e) {
            System.out.println("Xəta: "  +  e.getMessage());
        }

        try {
            kocurmeEt(-500);
        }catch (IllegalArgumentException e) {
            System.out.println("Xəta: " +  e.getMessage());
        }
    }
}
