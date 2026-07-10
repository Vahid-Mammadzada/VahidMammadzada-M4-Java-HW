package Modul4HW6;

import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gizli = 41;
        int texmin = 1;
        int cehd = 0;

        while (texmin != gizli) {
            System.out.print("Ədədi daxil edin: ");
            texmin = sc.nextInt();
            cehd++;

            if (texmin > gizli) {
                System.out.println("Böyükdür");
            } else if (texmin < gizli) {
                System.out.println("Kiçikdir");
            } else {
                System.out.println("Tapdın!");
            }
        }
        System.out.println("Ümumi cəhd sayı: " + cehd);
        sc.close();
    }
}

