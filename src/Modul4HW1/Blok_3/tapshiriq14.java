package Modul4HW1.Blok_3;

public class tapshiriq14 {
    public static void main(String[] args) {

        // • Cüt mi?
        //• Müsbət mi?
        //• 3-ə bölünür?
        //• 7-yə bölünür?
        //• Həm 3-ə, həm 7-yə bölünür?
        //• 10-dan böyük, 100-dən kiçik?

        int n = 84;

        boolean cutdur1 = n % 2 == 0;
        boolean musbetdir1 = n > 0;
        boolean ucebolunur1 = n % 3 == 0;
        boolean yeddiyebolunur1 = n % 7 == 0;
        boolean hemuchemyeddiyebolunur1 = (n % 3 == 0) && (n % 7 == 0);
        boolean araliqadir1 = 10 < n && n < 100;

        System.out.println("Cütdür:                         " + cutdur1);
        System.out.println("Müsbətdir:                      " + musbetdir1);
        System.out.println("3-ə bölünür:                    " + ucebolunur1);
        System.out.println("7-ə bölünür:                    " + yeddiyebolunur1);
        System.out.println("Həm 3, həm 7-ə bölünür:         " + hemuchemyeddiyebolunur1);
        System.out.println("10-dan böyük, 100 dən kiçikdir: " + araliqadir1);
        System.out.println(); // Qarışıqlıq olmaması üçün.

        int m = 105;

        boolean cutdur2 = m % 2 == 0;
        boolean musbetdir2 = m > 0;
        boolean ucebolunur2 = m % 3 == 0;
        boolean yeddiyebolunur2 = m % 7 == 0;
        boolean hemuchemyeddiyebolunur2 = (m % 3 == 0) && (m % 7 == 0);
        boolean araliqadir2 = 10 < m && m < 100;

        System.out.println("Cütdür:                         " + cutdur2);
        System.out.println("Müsbətdir:                      " + musbetdir2);
        System.out.println("3-ə bölünür:                    " + ucebolunur2);
        System.out.println("7-ə bölünür:                    " + yeddiyebolunur2);
        System.out.println("Həm 3, həm 7-ə bölünür:         " + hemuchemyeddiyebolunur2);
        System.out.println("10-dan böyük, 100 dən kiçikdir: " + araliqadir2);




    }
}
