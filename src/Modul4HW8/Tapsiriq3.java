package Modul4HW8;

import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eded = 1;

        do {
            System.out.print("Ədədi daxil edin: ");
            eded = sc.nextInt();

            if (eded <= 0) {
                System.out.println("Yenidən daxil edin");
            } else {
                System.out.println("Qəbul edildi: " + eded);
            }

        } while (eded <= 0);
        sc.close();
    }
}

