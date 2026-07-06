package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = sc.nextInt();

        if (yas >= 0 && yas <= 5) {
            System.out.println("Pulsuz");
        } else if (yas >= 6 && yas <= 17) {
            System.out.println("5 AZN");
        } else if (yas >= 18 && yas <= 64) {
            System.out.println("10 AZN");
        } else if (yas >= 65) {
            System.out.println("3 AZN");
        } else {
            System.out.println("Yanlış yaş");
        }
    }
}
