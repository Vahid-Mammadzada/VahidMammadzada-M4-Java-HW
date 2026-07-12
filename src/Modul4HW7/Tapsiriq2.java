package Modul4HW7;

import java.util.Scanner;

public class Tapsiriq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double umumi = 0;

        for (int i = 1 ; i <= 3; i++) {
            System.out.print(i + "-ci günün satışı: ");
            double satis = sc.nextDouble();
            umumi += satis;
        }

        double orta = umumi / 3;

        System.out.println("Ümumi məbləğ: " + umumi + " AZN");
        System.out.println("Orta günlük satış: " + orta + " AZN");

        if (orta > 500) {
            System.out.println("Həftə uğurludur");
        } else {
            System.out.println("Satışı artırmaq lazımdır");
        }
        sc.close();
    }
}
