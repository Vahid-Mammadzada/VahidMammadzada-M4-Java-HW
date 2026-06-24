package Modul4HW1.Blok_3;

public class tapshiriq15 {
    public static void main(String[] args) {

        int a = 10, b = 3;

        boolean x = true, y = false;

        String s = "Java";

        System.out.println(a + b * 2); // 16 -- ilk vurma əməli
        System.out.println(a / b); // 3 -- int olduğu üçün tam hissə
        System.out.println(a % b); // 1 -- Qalıq hissə
        System.out.println(x && !y); // ! olduğu üçün y true olur hər iki tərəf true olduğu üçün nəticə true
        System.out.println(!x || y); // ! olduğu üçün x false olur, hər iki tərəf false, nəticə false.
        System.out.println(a > 5 && b < 5); // a 5-dən böyük, b 5-dən balacadır true.
        System.out.println(s + a); // Stringlə int toplananda int stringə çevrilir və birləşir.
        System.out.println("3" + 4); // 34 string
        System.out.println(3 + 4 + "!"); // 7! string
        System.out.println("!" + 3 + 4); // !34 string

    }
}
