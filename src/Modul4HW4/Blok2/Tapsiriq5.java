package Modul4HW4.Blok2;

import java.util.Scanner;

public class Tapsiriq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        double doubleA = a;
        System.out.println("Widening: " + doubleA);

        System.out.print("b: ");
        double b = sc.nextDouble();

        int intB = (int)b; // int dəyərdə yanlız tam ədədlər olduğu üçün ondalıq hissə məcburi atılır.
        System.out.println("Narrowing: " + intB);
    }
}
