package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tam ədədi daxil edin: ");
        int tamEded = sc.nextInt();

        if (tamEded % 2 == 0) {
            System.out.println("Cüt ədəddir");
        } else {
            System.out.println("Tək ədəddir");
        }

        if (tamEded > 0) {
            System.out.println("Müsbət ədəddir");
        } else if (tamEded < 0) {
            System.out.println("Mənfi ədəddir");
        } else {
            System.out.println("Ədəd 0-a bərabərdir");
        }
        }
    }

