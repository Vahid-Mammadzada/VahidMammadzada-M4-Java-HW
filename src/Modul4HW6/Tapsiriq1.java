package Modul4HW6;

import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Balınızı daxil edin: ");
        int bal = sc.nextInt();

        if (bal < 1 || bal > 100) {
            System.out.println("1 - dən kiçik və 100 - dən böyük bal daxil etmək olmaz.");
        } else if (bal >= 90) {
            System.out.println("Bal: " + bal + " ---> Qiymət: Əla");
        } else if (bal >= 70) {
            System.out.println("Bal: " + bal + " ---> Qiymət: Yaxşı");
        } else if (bal >= 50) {
            System.out.println("Bal: " + bal + " ---> Qiymət: Kafi");
        } else {
            System.out.println("Bal: " + bal + " ---> Qiymət: Qeyri-kafi");
        }

        sc.close();

    }
}

