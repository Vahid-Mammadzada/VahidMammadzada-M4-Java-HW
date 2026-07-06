package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a - tərəfinin uzunluğunu daxil edin: ");
        int a = sc.nextInt();

        System.out.print("b - tərəfinin uzunluğunu daxil edin: ");
        int b = sc.nextInt();

        System.out.print("c - tərəfinin uzunluğunu daxil edin: ");
        int c = sc.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Bərabərtərəfli");
            } else if (a == b || b == c || a == c) {
                System.out.println("Bərabəryanlı");
            } else  {
                System.out.println("Müxtəliftərəfli");
            }
        } else {
            System.out.println("Belə üçbucaq mövcud deyil");
        }

    }
}