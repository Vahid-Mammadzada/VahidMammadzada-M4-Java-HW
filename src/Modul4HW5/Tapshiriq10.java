package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====BANK MENYUSU====");
        System.out.println("1 - Balans yoxla");
        System.out.println("2 - Pul yatır");
        System.out.println("3 - Pul çıxar");
        System.out.println("4 - Çıxış");
        System.out.println();

        System.out.print("Seçiminizi daxil edin: ");
        int secim = sc.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Balansınız 1236 AZN");
                break;
            case 2:
                System.out.println("Pul yatırma uğurla həyata keçirildi");
                break;
            case 3:
                System.out.println("Pul çıxarma uğurla həyata keçirildi");
                break;
            case 4:
                System.out.println("Çıxış uğurla həyata keçirildi");
                break;
            default:
                System.out.println("Yanlış seçim");
        }


    }
}
