package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Parolunuzu daxil edin: ");
        String parol = sc.nextLine();
        int uzunluq = parol.length();

        if (uzunluq == 0) {
            System.out.println("Parol boş ola bilməz");
        } else if (uzunluq < 6) {
            System.out.println("Zəif");
        } else if (uzunluq >= 6 && uzunluq <= 9 ) {
            System.out.println("Orta");
        } else if (uzunluq >= 10) {
            System.out.println("Güclü");
        }

    }
}
