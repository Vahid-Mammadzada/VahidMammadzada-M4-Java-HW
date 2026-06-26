package Modul4HW2.Blok3;

public class Tapshiriq9 {
    public static void main(String[] args) {

        String kod = "  abb-2024  ";

        System.out.println(kod.length());                    // ? — gözlənilən: 8
        // Stringin uzunluğuna boşluqlarda daxildir, 2 boşluq + "abb-2024" (8 simvol) + 2 boşluq == 12.

        System.out.println(kod.contains("ABB"));              // ? — gözlənilən: true
        // .contains() case sesitive-dir, böyük və kiçik hərf həssaslığı var.
        // Düzəldilmiş:
        System.out.println(kod.toUpperCase().contains("ABB"));

        System.out.println(kod.trim() == "abb-2024");         // ? — gözlənilən: true
        // == operatoru dəyər olaraq müqayisə etmir, String-ləri müqayisə etmək üçün .equals() işlədilir.
        // Düzəldilmiş:
        System.out.println(kod.trim().equals("abb-2024"));

        System.out.println(kod.toUpperCase().contains("ABB")); // ? — gözlənilən: true
        // Doğrudur .toUpperCase() operatoru bütün hərfləri böyük hərfə çevirir və belə olduqda contains - true olur.
    }
}
