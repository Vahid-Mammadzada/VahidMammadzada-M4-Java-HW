package Modul4HW7;

import java.util.Scanner;

public class Tapsiriq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secim = 1;

        while (secim != 0) {

            System.out.println("======ÇEVİRİCİ MENYUSU======");
            System.out.println("      1) Metr → Fut");
            System.out.println("      2) Kiloqram → Funt");
            System.out.println("      3) Selsi → Fahrenheit");
            System.out.println("      0) Çıxış");

            System.out.print("Seçiminizi daxil edin: ");
            secim = sc.nextInt();

            if (secim == 0) {
                System.out.println("Çıxış edildi");
                break;
            }

            System.out.print("Ədədi daxil edin: ");
            double eded = sc.nextDouble();

            switch (secim) {
                case 1:
                    System.out.println("Nəticə: " + (eded * 3.28084));
                    break;
                case 2:
                    System.out.println("Nəticə: " + (eded * 2.20462));
                    break;
                case 3:
                    System.out.println("Nəticə: " + (eded * 9.0/5 + 32));
                    break;
            }
        }
        sc.close();
    }
}
