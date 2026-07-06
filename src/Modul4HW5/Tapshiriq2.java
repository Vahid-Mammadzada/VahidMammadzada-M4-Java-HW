package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a - tam ədədini daxil edin:");
        int a = sc.nextInt();

        System.out.print("b - tam ədədini daxil edin:");
        int b = sc.nextInt();

        System.out.print("c - tam ədədini daxil edin:");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("a - ən böyük ədəddir: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("b - ən böyük ədəddir: " + b);
        } else {
            System.out.println("c - ən böyük ədəddir: " + c);
        }

        if (a <= b && a <= c) {
            System.out.println("a - ən kiçik ədəddir: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("b - ən kiçik ədəddir: " + b);
        } else {
            System.out.println("c - ən kiçik ədəddir: " + c);
        }

    }
}
