package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1-ci ədədi daxil edin: ");
        double ededBir = sc.nextDouble();

        System.out.print("2-ci ədədi daxil edin: ");
        double ededIki = sc.nextDouble();

        System.out.print("Əmliyyat işarəsini daxil edin: ");
        String isare = sc.next();

        switch (isare) {
            case "+":
                System.out.println(ededBir + ededIki);
                break;
            case "-":
                System.out.println(ededBir - ededIki);
                break;
            case "*":
                System.out.println(ededBir * ededIki);
                break;
            case "/":
                if (ededIki != 0) {
                    System.out.println(ededBir / ededIki);
                } else System.out.println("0-a bölmək olmaz!");
                break;
            default:
                System.out.println("Naməlum işarə!");
        }


    }
}
