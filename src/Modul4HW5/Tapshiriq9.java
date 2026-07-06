package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ay nömrəsini daxil edin: ");
        int ay = sc.nextInt();

        switch (ay) {
            case 12:
            case 1:
            case 2:
                System.out.println("Qış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Yaz");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yay");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Payız");
                break;
            default:
                System.out.println("Yanlış ay nömrəsi");
        }

    }
}
