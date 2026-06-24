package Modul4HW1.Blok_2;

public class tapshiriq8 {
    public static void main(String[] args) {

        int c0 = 0;
        double f0int = c0 * 9 / 5  + 32; // Qalıq yoxdur, ona görə nəticə dəyişmir
        double f0double = c0 * 9.0 / 5 +32;

        System.out.println("0_Səhv:    " + f0int);
        System.out.println("0_Doğru:   " + f0double);

        int c100 = 100;
        double f100int = c100 * 9 / 5  + 32; // Qalıq yoxdur, ona görə nəticə dəyişmir
        double f100double = c100 * 9.0 / 5 +32;

        System.out.println("100_Səhv:  " + f100int);
        System.out.println("100_Doğru: " + f100double);

        int c37 = 37;
        double f37int = c37 * 9 / 5 + 32; // Səhv : int dəyər ilə bölmə.
        double f37double = c37 * 9.0 /5 +32; // Doğru : Double dəyər ilə bölmə

        System.out.println("37_Səhv:   " + f37int);
        System.out.println("37_Doğru:  " + f37double);
    }
}
