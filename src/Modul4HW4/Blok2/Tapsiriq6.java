package Modul4HW4.Blok2;

import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ədədi daxil edin: ");
        String  eded = sc.next();

        int intEded = Integer.parseInt(eded);

        int int3VurEded= intEded * 3;

        System.out.println("3-ə vurulanda: " + int3VurEded );

        String yekunEded = String.valueOf(int3VurEded);
        System.out.println("Uzunluq:       " + yekunEded.length());



    }
}