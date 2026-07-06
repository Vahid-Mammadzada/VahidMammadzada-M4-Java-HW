package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gün nömrəsini daxil edin: ");
        int gun = sc.nextInt();

        switch (gun) {
            case 1:
                System.out.println("Bazar ertəsi");
                break;
            case 2:
                System.out.println("Çərşənbə axşamı");
                break;
            case 3:
                System.out.println("Çərşənbə");
                break;
            case 4:
                System.out.println("Cümə axşamı");
                break;
            case 5:
                System.out.println("Cümə");
                break;
            case 6:
                System.out.println("Şənbə");
            case 7:
                System.out.println("Bazar");
                System.out.println("Həftə sonu!");
                break;
            default:
                System.out.println("Yanlış gün nömrəsi");
        }



    }
}
