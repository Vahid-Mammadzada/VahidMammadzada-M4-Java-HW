package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hərfi daxil edin: ");
        String herf = sc.next();
        char charHerf = herf.charAt(0);
        charHerf = Character.toLowerCase(charHerf);

        switch (charHerf) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Sait");
                break;
            default:
                System.out.println("Samit");
        }
    }
}
