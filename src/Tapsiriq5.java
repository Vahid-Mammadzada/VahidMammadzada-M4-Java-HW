import java.util.ArrayList;

public class Tapsiriq5 {
    public static void main(String[] args) {
        ArrayList<String> novbe = new ArrayList<>();
        novbe.add("Ayxan");
        novbe.add("Aysel");
        novbe.add("Tural");
        novbe.add("Rəhim");

        novbe.add(0 , "VIP - Kamran");

        boolean var = novbe.contains("Tural");
        System.out.println("Tural növbədədir: " + var);

        novbe.set(3 , "Vahid");

        for (int i = 0 ; i < novbe.size(); i++) {
            System.out.println(i + ": " + novbe.get(i));
        }
    }
}
