package Modul4HW2.Blok4;

public class Tapshiriq11 {
    public static void main(String[] args) {

        String parol = "Abb@2024";

        boolean uzunUygun = parol.length() > 8;
        System.out.println("Uzunluğu 8-dən çoxdur?:                             " + uzunUygun);

        boolean xarakterVar = parol.contains("@");
        System.out.println("@ simvolu var mı?                                   " + xarakterVar);

        boolean abbIleBaslalyir = parol.toUpperCase().startsWith("ABB");
        System.out.println("Böyük hərfə çevirdikdə ABB ilə başlayırmı?:         " + abbIleBaslalyir);

        boolean reqemVar = parol.contains("2024");
        System.out.println("Rəqəm var mı — 2024 hissəsi mövcuddur?:             " + reqemVar);

        boolean gucluParol = uzunUygun && xarakterVar && abbIleBaslalyir && reqemVar;
        System.out.println("Parol güclüdür mi? (yuxarıdakı 4 şərt hamısı true): " + gucluParol);

    }
}
