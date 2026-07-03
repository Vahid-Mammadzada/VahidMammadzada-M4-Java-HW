package Modul4HW4.Blok2;

import java.util.Scanner;

public class Tapsiriq8 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius dərəcəsini daxil edin: ");
        int c = sc.nextInt();

        double f = c * 9 / 5 + 32;
        System.out.println("Faranheyt yalnış: " + f); // Nəticə yalnışdır çünki hesablamada bütün dəyərlər int-dir.

        // Düzgün hesablama:

        double fDuzgun = c * 9.0 / 5 + 32;
        System.out.println("Faranheyt doğru " + fDuzgun);



    }
}
