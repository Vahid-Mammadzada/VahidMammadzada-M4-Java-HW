package Modul4HW2.Blok2;

public class Tapshiriq5 {
    public static void main(String[] args) {

        int bal1 = 78, bal2 = 91, bal3 = 84;
        double orta = (bal1 + bal2 + bal3) / 3.0; // dəyərlərdən biri double olduqda nəticə double olur.
        System.out.println("Orta bal: " + orta);
        // "(bal1 + bal2 + bal3) / 3" -  yalnışdır çünki int dəyərlər toplandıqda qalıq atılır, nəticə 84 olur.
    }
}
