package Modul4HW4.Blok2;

import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dəyər daxil edin: ");
        double deyer = sc.nextDouble();

        int intDeyer = (int)deyer;
        System.out.println("(int):        " + intDeyer);

        double yuvarlaqDeyer = Math.round(deyer);
        System.out.println("Math.round(): " + yuvarlaqDeyer);
    }
}
