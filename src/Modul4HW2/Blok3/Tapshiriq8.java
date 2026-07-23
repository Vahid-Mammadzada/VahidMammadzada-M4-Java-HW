package Modul4HW2.Blok3;

public class Tapshiriq8 {
    public static void main(String[] args) {

        int yas = 25;
        double gelir = 1200.0;
        boolean tarix = true;

        // Modul4HW10.HW5.Kredit şərti: yaş 21-65, gəlir 800-dən çox, tarix true olmalı

        boolean yasUygun  = yas >= 21 && yas <= 65;   // böyük bərabərlik və kiçik bərabərlik
                                                      // operatorları istifadə olunmalıdır 21 və 65 -də
                                                      // true olsun deyə.

        boolean gelirUygun = gelir > 800;              // nəticə doğrudur.

        boolean uygun      = yasUygun && gelirUygun && tarix; // Bütün şərtlər eyni vaxtda ödənilməlidir
                                                              // deyə && operatoru istifadə edilir.

        System.out.println("Yaş uyğun:   " + yasUygun);
        System.out.println("Gəlir uyğun: " + gelirUygun);
        System.out.println("Modul4HW10.HW5.Kredit:      " + uygun);
    }
}
