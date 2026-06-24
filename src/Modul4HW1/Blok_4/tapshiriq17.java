package Modul4HW1.Blok_4;

public class tapshiriq17 {
    public static void main(String[] args) {

        String s1 = "test";
        String s2 = "test";
        String s3 = "TEST";

        System.out.println(s1.equals(s2)); // İki söz eynidir - true
        System.out.println(s1.equals(s3)); // İki söz fərqlidir - false
        System.out.println(s1.equalsIgnoreCase(s3)); // İki söz eyni formaya çevrilir - true
        System.out.println(s1.equals(" test ".trim())); // Trimlə boşluqlar silinir və eyni söz olur - true

        String s4 = new String("test");

        System.out.println(s1 == s2); // Eyni yer - True
        System.out.println(s1 == s4); // s4 Yeni - False





    }
}
