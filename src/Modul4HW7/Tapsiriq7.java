package Modul4HW7;

import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kod = 275;
        int texmin = 0;
        int cehd = 0;

        while (texmin != kod) {
            System.out.print("Kodu daxil edin: ");
            texmin = sc.nextInt();
            cehd++;

            if (texmin > kod) {
                System.out.println("Böyükdür");
            } else if (texmin < kod) {
                System.out.println("Kiçikdir");
            } else {
                System.out.println("Seyf açıldı!");
            }
        }
        System.out.println("Ümumi cəhd sayı: " + cehd);
        sc.close();
    }
}
