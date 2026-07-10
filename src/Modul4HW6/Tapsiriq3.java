package Modul4HW6;

import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Balansınızı daxil edin: ");
        double balans = sc.nextDouble();

        double emeliyyat = 1.0;

        while (emeliyyat != 0) {

            System.out.print("Əməliyyat məbləğini daxil edin: ");
            emeliyyat =sc.nextDouble();

            if (emeliyyat == 0) {
                break;
            }

            balans = balans +  emeliyyat;

            System.out.println("Balans: " + balans + " AZN");

            if (balans < 0) {
                System.out.println("Balans mənfidir!");
            }
            }
        sc.close();
        }
    }


