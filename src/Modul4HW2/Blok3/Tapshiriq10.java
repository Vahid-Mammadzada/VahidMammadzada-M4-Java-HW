package Modul4HW2.Blok3;

public class Tapshiriq10 {
    public static void main(String[] args) {

        int    meblеg = 5000;
        int    faiz   = 15;
        double faizMeblegi = meblеg * faiz / 100;

        System.out.println("Faiz məbləği: " + faizMeblegi);
// Gözlənilən: 750.0   Əsl çıxış: ???

        // Əsl çıxışda düzgün nəticəni verir amma bu dəyərlərdə qalıq hissə olmadığı üçün belə olur.
        // double dəyər əldə etmək üçün dəyərlərdən heç olmasa biri double dəyər olmalıdır.

        double faizmeblegi1 = meblеg * faiz / 100.0; // Düzəliş 1 :
        System.out.println("Faiz məbləği1: " + faizmeblegi1);

        double faizmeblegi2 = (double) meblеg * faiz / 100; // Düzəliş 2 :
        System.out.println("Faiz məbləği2: " +faizmeblegi2);

        double faizmeblegi3 = (double) (meblеg * faiz) / 100; // Düzəliş 3 :
        System.out.println("Faiz məbləği3: " + faizmeblegi3);

    }
}
