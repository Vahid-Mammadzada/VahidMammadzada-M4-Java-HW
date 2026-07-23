package Modul4HW4.Blok1;

import java.util.Scanner;

public class Tapsiriq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Modul4HW10.HW5.Kredit məbləğini daxil edin: ");
        double kreditMeblegi = sc.nextDouble();

        System.out.print("İllik faiz daxil edin: ");
        double illikFaiz = sc.nextDouble();

        System.out.print("Müddət daxil edin: ");
        int muddet = sc.nextInt();

        double umumiFaiz = kreditMeblegi * (illikFaiz/100);
        double umumiOdenis = kreditMeblegi + umumiFaiz;
        double ayliqOdenis = umumiOdenis / muddet;

        System.out.println("==============KREDİT HESABI============");
        System.out.printf("Məbləğ:       %.2f AZN%n", kreditMeblegi);
        System.out.println("İllik faiz:   " + illikFaiz + " %");
        System.out.println("Müddət:       " + muddet + " ay");
        System.out.println("---------------------------------------");
        System.out.printf("Ümumi faiz:   %.2f AZN%n", umumiFaiz);
        System.out.printf("Ümumi odəniş: %.2f AZN%n", umumiOdenis);
        System.out.printf("Aylıq ödəniş: %.2f AZN%n", ayliqOdenis);
        System.out.println("=======================================");

    }
}
