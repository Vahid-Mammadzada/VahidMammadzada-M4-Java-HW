package Modul4HW1.Blok_4;

public class tapshiriq18 {
    public static void main(String[] args) {

        String tamAd = "leyla hüseynova";

        String ad = tamAd.substring(0, 5);
        String soyad = tamAd.substring(6);

        String boyukAd = ad.substring(0,1).toUpperCase() + ad.substring(1);
        String boyukSoyad = soyad.substring(0,1).toUpperCase() + soyad.substring(1);

        String basHerflerBoyuk = boyukAd + " " + boyukSoyad;
        System.out.println(basHerflerBoyuk);

        System.out.println("Ümumi uzunluq: " + tamAd.length());
        System.out.println("İlk 5 hərf: " + tamAd.substring(0,5));
        System.out.println("Boşluq varmı?: " + tamAd.contains(" "));
        System.out.println("ad leyla ilə başlayırmı?: " + tamAd.startsWith("leyla"));
        System.out.println("Böyük hərflə tam ad: " + tamAd.toUpperCase());
}
}
