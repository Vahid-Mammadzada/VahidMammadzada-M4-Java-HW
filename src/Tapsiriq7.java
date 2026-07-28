import java.util.HashMap;
import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> musteri = new HashMap<>();
        musteri.put("001","Ayxan");
        musteri.put("002","Tural");
        musteri.put("003","Vahid");
        musteri.put("004","Məmməd");

        System.out.print("Müştəri kodunu daxil edin: ");
        String kod = sc.nextLine();

        if (musteri.containsKey(kod)) {
            System.out.println("Müştəri: " + musteri.get(kod));
        } else {
            System.out.println("Belə müştəri tapılmadı");
        }
        sc.close();
    }
}
