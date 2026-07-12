package Modul4HW6;

import java.util.Scanner;

public class Tapsiriq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("İllik əmanət məbləğini daxil edin: ");
        double ilkinMebleg = sc.nextDouble();

        System.out.print("İllik faiz dərəcəsini daxil edin: ");
        double faiz = sc.nextDouble();

        double cariMebleg = ilkinMebleg;
        int il = 0;

        while (cariMebleg < (ilkinMebleg*2)) {
            cariMebleg = cariMebleg + (cariMebleg * faiz / 100);
            il++;
            System.out.println(il + "-ci il: " + cariMebleg + " AZN");
        }

        System.out.println("Məbləğ ikiqat olmaq üçün " + il + " il çəkdi.");
        sc.close();
    }
}
