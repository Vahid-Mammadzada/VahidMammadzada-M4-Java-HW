public class Tapsiriq2 {
    public static void main(String[] args) {

        String kartSahibi = null;

        try {
            System.out.println("Simvol sayı: " + kartSahibi.length());
        } catch (NullPointerException e) {
            System.out.println("Kart məlumatı tapılmadı");
        } catch (Exception e) {
            System.out.println("Naməlum xəta baş verdi!");
        } finally {
            System.out.println("Sessiya bağlandı");
        }
        System.out.println("------------------");

        kartSahibi = "Vahid Mammadzada";

        try {
            System.out.println("Simvol sayı: " + kartSahibi.length());
        } catch (NullPointerException e) {
            System.out.println("Kart məlumatı tapılmadı");
        } catch (Exception e) {
            System.out.println("Naməlum xəta baş verdi!");
        } finally {
            System.out.println("Sessiya bağlandı");
        }
    }
}
