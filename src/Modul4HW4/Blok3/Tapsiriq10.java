package Modul4HW4.Blok3;

import java.util.Scanner;

public class Tapsiriq10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Adınızı daxil edin: ");
        String ad = sc.nextLine();

        System.out.print("Yaşınızı daxil edin: ");
        int yas = sc.nextInt();

        System.out.print("İllik gəlirinizi daxil edin: ");
        String illikGelir = sc.next();
        double doubleIllikGelir = Double.parseDouble(illikGelir);

        boolean bosluqVar = ad.contains(" ");
        boolean simvol5DenCox = ad.length() >= 5;
        boolean yasAraliqdadir = yas >= 18 && yas <= 70;
        boolean uygunIllikGelir = doubleIllikGelir >= 3000;
        boolean uygunMusteri = bosluqVar && simvol5DenCox && yasAraliqdadir && uygunIllikGelir;

        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("İllik gəlir: " + doubleIllikGelir + "AZN");
        System.out.println();

        System.out.println("===============SIĞORTA ŞƏRTLƏRİ================");
        System.out.println("Ad-soyad boşluqla yazılıbmı? " + bosluqVar);
        System.out.println("Ad-soyad 5+ simvoldur?       " + simvol5DenCox);
        System.out.println("Yaş 18–70 aralığındadır?     " + yasAraliqdadir);
        System.out.println("İllik gəliri uyğundur?       " + uygunIllikGelir);
        System.out.println();
        System.out.println("==================YEKUN NƏTİCƏ==================");
        System.out.printf("Ad soyad:           %s%n", ad.toUpperCase());
        System.out.printf("İllik gəlir:        %.2f AZN%n", doubleIllikGelir);
        System.out.printf("Sigortaya uyğundur: %b%n", uygunMusteri);

    }
}
