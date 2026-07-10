package Modul4HW6;

import java.util.Scanner;

public class Tapsiriq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secim = 1;

        while (secim != 0) {
            System.out.println("========KALKUlYATOR========");
            System.out.println("         1) Cəm");
            System.out.println("         2) Fərq");
            System.out.println("         3) Hasil");
            System.out.println("         4) Bölmə");
            System.out.println("         0) Çıxış");

            System.out.print("Seçiminizi daxil edin: ");
            secim = sc.nextInt();

            if (secim < 1 || secim > 4) {
                System.out.println("0-4 arası seçim edilə bilər");
                continue;
            }

            System.out.print("1-ci ədədi daxil edin: ");
            double ilkEded = sc.nextDouble();

            System.out.print("2-ci ədədi daxil edin: ");
            double ikinciEded = sc.nextDouble();

            switch (secim) {
                case 1:
                    System.out.println("Nəticə: " + (ilkEded + ikinciEded));
                    break;
                case 2:
                    System.out.println("Nəticə: " + (ilkEded - ikinciEded));
                    break;
                case 3:
                    System.out.println("Nəticə: " + (ilkEded * ikinciEded));
                    break;
                case 4:
                    if (ikinciEded == 0 ) {
                        System.out.println("Sıfıra bölmək olmaz!");
                    } else {
                        System.out.println("Nəticə: " + (ilkEded / ikinciEded));
                    }
            }
        }
        sc.close();
    }
}

