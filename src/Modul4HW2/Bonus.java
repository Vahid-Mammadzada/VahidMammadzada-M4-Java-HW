package Modul4HW2;

public class Bonus {
    public static void main(String[] args) {

        final int MIN_YAS = 18;
        final int MIN_PAROL_UZUNLUQ = 8;
        final double MIN_GELIR = 500.0;

        String ad = "vahid";
        int yas = 24;
        double gelir = 1000.0;
        String parol = "vahid2026";
        String elektronPoct = "vahidmammadzada@gmail.com";

        boolean adBosDeyil = ad.length() > 0;
        System.out.println("Ad Boş deyil (uzunluğu > 0): " + adBosDeyil);

        boolean yasBoyukYadaBeraber = yas >= MIN_YAS;
        System.out.println("Yaş minimum yaşdan böyük və ya bərabərdir: " + yasBoyukYadaBeraber);

        boolean gelirMinimumdanCox = gelir > MIN_GELIR;
        System.out.println("Gəlir minimum gəlirdən çoxdur: " + gelirMinimumdanCox);

        boolean parolMinimumdanUzun = parol.length() >= MIN_PAROL_UZUNLUQ;
        System.out.println("Parol minimum uzunluğu ödəyir: " + parolMinimumdanUzun);

        boolean elektronPoctdaXarakterVar = elektronPoct.contains("@");
        System.out.println("Elektron poçtda @ işarəsi var: " + elektronPoctdaXarakterVar);

        boolean qeydiyyatUgurludur = adBosDeyil && yasBoyukYadaBeraber && gelirMinimumdanCox && parolMinimumdanUzun && elektronPoctdaXarakterVar;
        System.out.println("Qeydiyyat uğurludur? (bütün yoxlamalar true olmalı): " + qeydiyyatUgurludur);

        String adFormatli = ad.substring(0,1).toUpperCase() + ad.substring(1);
        System.out.println("Formatlı ad: " + adFormatli );

        // MIN_YAS= 23; -- java: cannot assign a value to final variable MIN_YAS
        // MIN_GELIR = 350.0; -- java: cannot assign a value to final variable MIN_GELIR
        // MIN_PAROL_UZUNLUQ = 9; -- java: cannot assign a value to final variable MIN_PAROL_UZUNLUQ

    }
}
