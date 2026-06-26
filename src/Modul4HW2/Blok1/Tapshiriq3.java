package Modul4HW2.Blok1;

public class Tapshiriq3 {
    public static void main(String[] args) {

        int     a = 8,  b = 3;
        boolean p = true, q = false;
        String  s = "QA";

        System.out.println(a + b);           // 11
        System.out.println(a - b * 2);      // 2 - operator öncəliyi (vurma/bölmə)
        System.out.println(a / b);           // 2 - int bölmə - yalnız tam hissə
        System.out.println(a % b);           // 2 - qalıq hissə
        System.out.println(p && q);          // false - && operatoru yalnız hər iki tərəf true olduqda nəticə true olur
        System.out.println(p || q);          // true - || operatoru ən azı bir tərəf true olduqda nəticə true olur
        System.out.println(!p && !q);        // false - ! operatoru dəyəri əksinə çevirir, dəyərlər yenə true və false olduğu üçün nəticə false olur
        System.out.println(a > 5 || b > 5);  // true || false = true
        System.out.println(s + a + b);       // QA83
        System.out.println(a + b + s);       // 11QA

        // Fərq var: "s+a+b"-də əvvəlcə String+int birləşir nəticədə string(QA8) olur, sonra QA8 stringinə 3 əlavə olunur.(QA83).
        // "a+b+s"-də isə int+int=int olduğu üçün a və b toplanır (8+3), sonra isə Stringlə toplanır.(11QA).

    }
}
