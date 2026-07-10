package Modul4HW6;

import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Operator kodunuzu daxil edin: ");
        String kod = sc.next();

        switch (kod) {
            case "050":
            case "051":
                System.out.println("Azercell");
                break;
            case "055":
            case "099":
                System.out.println("Bakcell");
                break;
            case "070":
            case "077":
                System.out.println("Nar");
                break;
            default:
                System.out.println("Naməlum operator");
        }
        sc.close();
    }
}

