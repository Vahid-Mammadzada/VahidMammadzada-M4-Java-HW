package Modul4HW4.Blok1;

import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Üç rəqəmli tam ədəd daxil edin:");
        int tamEded = sc.nextInt();

        int yuzler = tamEded / 100;
        int onlar = (tamEded % 100) / 10;
        int birler =  tamEded % 10;

        System.out.println("Yüzlər:  " + yuzler);
        System.out.println("Onlar:   " + onlar);
        System.out.println("Birlər:  " + birler);
        System.out.println("Cəm:     " + (yuzler + onlar + birler));
    }
}
