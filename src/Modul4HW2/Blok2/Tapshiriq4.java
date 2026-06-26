package Modul4HW2.Blok2;

public class Tapshiriq4 {
    public static void main(String[] args) {

        int a = 15, b = 40;

        System.out.println("Əvvəl: a=" + a + ", b=" + b);

        int temp = a; // a - nın köhnə dəyərini saxlayır.
        a = b;   // a-ya b-nin dəyərini verir.
        b = temp;  // b-yə isə a nın köhnə saxladığı dəyərini verir
        System.out.println("Sonra: a=" + a + ", b=" + b);

    }
}
