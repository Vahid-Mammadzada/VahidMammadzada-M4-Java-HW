package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = sc.nextInt();

        System.out.print("Gəlirinizi daxil edin: ");
        double gelir = sc.nextDouble();

        System.out.print("Modul4HW10.HW5.Kredit məbləğini daxil edin: ");
        double mebleg = sc.nextDouble();

        if (yas < 21 || yas > 65) {
            System.out.println("Rədd edildi: yaş uyğun deyil");
        } else if (gelir < 800) {
            System.out.println("Rədd edildi: gəlir uyğun deyil");
        } else if (mebleg < 300 || mebleg > 50000) {
            System.out.println("Rədd edildi: məbləğ uyğun deyil");
        } else {
            System.out.println("TƏSDİQ EDİLDİ");
        }


    }

}
