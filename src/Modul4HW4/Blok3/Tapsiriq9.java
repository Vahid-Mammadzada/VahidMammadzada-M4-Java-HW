package Modul4HW4.Blok3;

import java.util.Scanner;

public class Tapsiriq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Emailinizi daxil edin: ");
        String email = sc.next();

        boolean isareVar = email.contains("@");
        boolean noqteVar = email.contains(".");
        boolean ikiSimvolVar = email.indexOf("@") >= 2;

        System.out.println("Emaildə @ işarəsi varmı?           " + isareVar);
        System.out.println("Emaildə .  varmı?                  " + noqteVar);
        System.out.println("@-dən əvvəl ən azı 2 simvol varmı? " + ikiSimvolVar);

    }
}
