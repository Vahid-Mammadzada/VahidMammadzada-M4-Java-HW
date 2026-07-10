package Modul4HW6;

import java.util.Scanner;

public class Tapsiriq8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = sc.nextInt();

        int qiymet = 0;

        if (yas < 0) {
            System.out.println("Yaş mənfi ola bilməz!");
            return;
        } else if (yas <= 7) {
            qiymet = 0;
        } else if (yas <= 17) {
            qiymet = 3;
        } else if (yas <= 64) {
            qiymet = 7;
        } else  {
            qiymet = 4;
        }

        System.out.println("Bilet qiyməti: " +qiymet + " AZN");

        System.out.println("Neçə bilet almaq istəyirsiniz? ");
        int say = sc.nextInt();

        System.out.println("Ümumi məbləğ: " + say*qiymet + " AZN");
        sc.close();

    }
}

