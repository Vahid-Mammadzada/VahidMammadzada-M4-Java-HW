package Modul4HW4.Blok1;

import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.println("Toplama:      " + (a + b));
        System.out.println("Çıxma:        " + (a - b));
        System.out.println("Vurma:        " + (a * b));
        System.out.println("Bölmə:        " + (a / b)); // Bölmə nəticə int dəyərlər olduğu üçün düzgün nəticə vermir, qalıq atılır.
        System.out.println("Bölmə düzgün  " + ((double)a/b)); // Dəyərlərdən biri double olduqda nəticə double olur və düzgün nəticə çıxır.
        System.out.println("Qalıq:        " + (a % b));


    }
}
