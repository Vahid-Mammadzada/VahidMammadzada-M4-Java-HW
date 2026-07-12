package Modul4HW7;

public class Tapsiriq5 {
    public static void main(String[] args) {

        int ilkin = 1000;
        double yekun = ilkin;
        int il = 0;

        while (yekun < (ilkin*2)) {
            yekun = yekun + yekun / 100 * 8.0;
            il++;
            System.out.println("İl " + il + ": " + String.format("%.2f", yekun) + " AZN");
        }
    }
}
