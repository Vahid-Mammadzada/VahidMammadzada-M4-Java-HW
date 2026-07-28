import java.util.ArrayList;

public class Tapsiriq6 {
    public static void main(String[] args) {
        ArrayList<Integer> emeliyyat = new ArrayList<>();

        emeliyyat.add(100);
        emeliyyat.add(200);
        emeliyyat.add(140);
        emeliyyat.add(230);
        emeliyyat.add(70);

        int cem = 0;
        for (int mebleg : emeliyyat) {
            cem += mebleg;
        }
        System.out.println("Ümumi cəm: " + cem + " AZN");

        emeliyyat.clear();
        System.out.println("Siyahı boşdur: " + emeliyyat.isEmpty());
    }
}
