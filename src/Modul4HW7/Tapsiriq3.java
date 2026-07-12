package Modul4HW7;

import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stok = 200;
        int emeliyyat = 1;

        while (emeliyyat != 0) {
            System.out.print("Əməliyyatı daxil edin: ");
            emeliyyat = sc.nextInt();

            stok = stok + emeliyyat;
            System.out.println("Yeni stok: " + stok);
        }
        sc.close();
    }
}
