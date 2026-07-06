package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("İli daxil edin: ");
        int il = sc.nextInt();

        System.out.println((il % 4 == 0 && il % 100 != 0) || (il % 400 == 0) ? "Uyğun il" : "Uyğun deyil");
    }
}
