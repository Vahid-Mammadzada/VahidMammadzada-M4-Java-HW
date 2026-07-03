package Modul4HW4.Blok1;

import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.println("a = " + a + ", b = " + b);

        a =  a + b;
        System.out.println("a = a + b ---> a = " + a + ", b = " + b);

        b = a - b;
        System.out.println("b = a - b ---> a = " + a + ", b = " + b);

        a = a - b;
        System.out.println("a = a - b ---> a = " + a + ", b = " + b);

        System.out.println("Yekun a = " + a + ", Yekun b = " + b);

    }
}
