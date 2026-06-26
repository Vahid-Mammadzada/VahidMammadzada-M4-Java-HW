package Modul4HW2.Blok4;

import java.util.Locale;

public class Tapshiriq12 {
    public static void main(String[] args) {

        String tamAd = "nigar əliyeva";
        int bosluqIndeksi = tamAd.indexOf(" ");

        String yalnizAd = tamAd.substring(0,bosluqIndeksi);
        String soyad = tamAd.substring(bosluqIndeksi +1);

        String adBoyuk = yalnizAd.substring(0, 1).toUpperCase() + yalnizAd.substring(1);
        System.out.println("Yalnız ad:              " + adBoyuk);

        String soyadBoyuk = soyad.substring(0, 1).toUpperCase() + soyad.substring(1);
        System.out.println("Yalnız soyad:           " + soyadBoyuk);

        String tamAdFormatlanmis = adBoyuk + " " + soyadBoyuk;
        System.out.println("Tam ad (formatlanmış) : " + tamAdFormatlanmis);

        String basHerfler = yalnizAd.substring(0,1).toUpperCase() + "." + soyad.substring(0, 1).toUpperCase() + ".";
        System.out.println("Baş hərflər:            " + basHerfler);

        String tamAdBoyuk1 = tamAdFormatlanmis.toUpperCase();
        String tamAdBoyuk2 = yalnizAd.toUpperCase() + " " + soyad.toUpperCase();
        System.out.println("Böyük hərflə:           " + tamAdBoyuk2);

        String tamAdBoyukDuzgun = tamAdFormatlanmis.toUpperCase(new Locale("az", "AZ"));
        System.out.println("Böyük hərflə düzgün :   " + tamAdBoyukDuzgun);
        // toUpperCase sistem dilinə uyğun dəyişikliklər edir (i-I). Locale ilə düzəldilə bilir.




    }
}
