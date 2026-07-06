package Modul4HW5;

import java.util.Scanner;

public class Tapshiriq13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Çəkinizi daxil edin (kq): ");
        double ceki = sc.nextDouble();

        System.out.print("Boyunuzu daxil edin (metrlə): ");
        double boy = sc.nextDouble();

        double bmi = ceki / (boy * boy);

        if (bmi < 18.5) {
            System.out.println("Arıq");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Artıq çəkili");
        } else {
            System.out.println("Piylənmə");
        }

    }
}
