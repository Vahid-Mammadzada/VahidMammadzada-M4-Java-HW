package Modul4HW7;

import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int enAzVaxt = 0;
        int suretli = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print(i + "-ci qaçışçının vaxtı: ");
            int vaxt = sc.nextInt();

            if (i == 1 || vaxt < enAzVaxt) {
                enAzVaxt = vaxt;
                suretli = i;
            }
        }
        System.out.println("Ən sürətli qaçışçı: " + suretli + " -ci" + " Qaçış vaxtı: " + enAzVaxt);
        sc.close();
    }
}
