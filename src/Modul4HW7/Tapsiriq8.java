package Modul4HW7;

import java.util.Scanner;

public class Tapsiriq8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = sc.nextInt();
        int qiymet = 0;

        if (yas >= 0 && yas <= 6) {
            qiymet = 0;
            System.out.println("Bir bilet üçün qiymət: Pulsuz");
        } else if (yas <= 17) {
            qiymet = 2;
            System.out.println("Bir bilet üçün qiymət: " + qiymet + " AZN");
        } else if (yas <= 60) {
            qiymet = 5;
            System.out.println("Bir bilet üçün qiymət: " + qiymet + " AZN");
        } else {
            qiymet = 3;
            System.out.println("Bir bilet üçün qiymət: " + qiymet + " AZN");
        }

        System.out.print("Bilet sayını daxil edin: ");
        int say = sc.nextInt();

        System.out.println("Ümumi məbləğ: " + (qiymet * say) + " AZN");
        sc.close();
    }
}
