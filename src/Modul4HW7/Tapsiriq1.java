package Modul4HW7;

import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Havanın temperaturunu daxil edin: ");
        int hava = sc.nextInt();

        if (hava > 25) {
            System.out.println("Temperatur: " + hava + "°C → Status: İsti");
        } else if (hava >= 15) {
            System.out.println("Temperatur: " + hava + "°C → Status: Mülayim");
        } else if (hava >= 0) {
            System.out.println("Temperatur: " + hava + "°C → Status: Soyuq");
        } else  {
            System.out.println("Temperatur: " + hava + "°C → Status: Şaxta");
        }
        sc.close();
    }
}
