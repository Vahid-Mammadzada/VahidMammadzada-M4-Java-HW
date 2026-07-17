package Modul4HW8;

import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eded = 0;
        int cem = 0;

        do {
            System.out.print("Ədədi daxil edin: ");
            eded = sc.nextInt();

            if (eded == 0) {
                break;
            }

            cem = cem + eded;
        } while (eded != 0);

        System.out.println("Cəm: " + cem);
        sc.close();
    }
}

