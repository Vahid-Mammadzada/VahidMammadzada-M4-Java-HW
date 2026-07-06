package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("İmtahan balınızı daxil edin: ");
        int bal = sc.nextInt();

        if (bal >= 90 && bal <= 100) {
            System.out.println("Əla (5)");
        } else if (bal >= 80 && bal <= 89) {
            System.out.println("Çox yaxşı (4)");
        } else if (bal >= 70 && bal <= 79) {
            System.out.println("Yaxşı (3)");
        } else if (bal >= 60 && bal <= 69) {
            System.out.println("Kafi (2)");
        } else if (bal >= 0 && bal <= 59) {
            System.out.println("Qeyri-kafi (1)");
        } else {
            System.out.println("Yanlış bal!");
        }

    }
}
