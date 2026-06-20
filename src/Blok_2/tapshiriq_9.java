package Blok_2;

public class tapshiriq_9 {
    public static void main(String[] args) {

        int sayi = 583;

        int yuzler = sayi / 100;        // int bölmə onluq atılır.
        int onlar = sayi % 100 / 10;    // Yüzlüklər çıxılır və 10-a bölünüb sayı tapılır.
        int birler = sayi % 10;         // Bütün onluqlar çıxılır və nəticədə qalıqlar görünür.
        int cem = yuzler + onlar + birler;

        System.out.println("Yüzlər:  " + yuzler);
        System.out.println("Onlar:   " + onlar);
        System.out.println("Birlər:  " + birler);
        System.out.println("Cəm:     " + cem);

        int sayi2 = 907;

        int yuzler2 = sayi2 / 100;
        int onlar2 = sayi2 % 100 / 10; // int bölmə tam hissəni götürür və tam onluq hissə olmadığı üçün 0 olur.
        int birler2 = sayi2 % 10;
        int cem2 = yuzler2 + onlar2 + birler2;

        System.out.println("Yüzlər2: " + yuzler2);
        System.out.println("Onlar2:  " + onlar2);
        System.out.println("Birlər2: " + birler2);
        System.out.println("Cəm2:    " + cem2);

    }
}
