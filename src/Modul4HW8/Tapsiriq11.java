package Modul4HW8;

public class Tapsiriq11 {
    public static void main(String[] args) {
        int[] orijinal = {5, 10, 15, 20};
        int[] kopya = new int[orijinal.length];

        for (int i=0; i < orijinal.length; i++) {
            kopya[i] = orijinal[i];
        }
        kopya[0]=99;
        System.out.print("Original: ");
        for (int org : orijinal) {
            System.out.print(org + " ");
        }
        System.out.println();
        System.out.print("Kopya: ");
        for (int kop : kopya) {
            System.out.print(kop + " ");
        }
    }
}

