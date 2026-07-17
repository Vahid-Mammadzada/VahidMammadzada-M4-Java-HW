package Modul4HW8;

public class Tapsiriq10 {
    public static void main(String[] args) {
        int[] ballar = {45, 78, 92, 30, 65, 88};
        int enKicik = ballar[0];
        int indeks = 0;

        for (int i = 0; i < ballar.length; i++) {
            if (ballar[i] < enKicik) {
                enKicik =ballar[i];
                indeks = i;
            }
        }
        System.out.println("Ən kiçik bal: " + enKicik);
        System.out.println("İndeksi: " + indeks);
    }
}

