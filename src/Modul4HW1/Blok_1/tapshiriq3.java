package Modul4HW1.Blok_1;

public class tapshiriq3 {
    public static void main(String[] args) {

        final int MIN_KREDIT_MEBLEGI = 300;
        final int MAX_KREDIT_MEBLEGI = 50000;
        final double ILLIK_STANDART_FAIZ = 10.9;
        final String BANKIN_QISA_ADI = "ABB";
        final int MAX_KREDIT_MUDDETI = 60;

        System.out.println("Minimum kredit məbləği:  " + MIN_KREDIT_MEBLEGI);
        System.out.println("Maksimum kredit məbləği: " + MAX_KREDIT_MEBLEGI);
        System.out.println("İllik standart faiz:     " + ILLIK_STANDART_FAIZ);
        System.out.println("Bankın qısa adı:         " + BANKIN_QISA_ADI);
        System.out.println("Maksimum kredit müddəti: " + MAX_KREDIT_MUDDETI);

        // MIN_KREDIT_MEBLEGI = 350;   // Final dəyişənə yenidən dəyər verdikdə xəta mesajı göstərilir.
        // xəta mesajı: "java: cannot assign a value to final variable MIN_KREDIT_MEBLEGI"

    }
}
