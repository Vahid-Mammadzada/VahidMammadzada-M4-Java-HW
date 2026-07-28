import java.util.HashMap;

public class Tapsiriq8 {
    public static void main(String[] args) {
        HashMap<String, Integer> filiallar = new HashMap<>();
        filiallar.put("Sahil",200);
        filiallar.put("Gənclik",150);
        filiallar.put("Nərimanov",250);
        filiallar.put("İçərişəhər",300);

        System.out.println("Cüt sayı: " + filiallar.size());


        for (String filial : filiallar.keySet()) {
            System.out.println(filial + " > " + filiallar.get(filial));
        }
        filiallar.remove("Gənclik");

        System.out.println("Yeni cüt sayi: " + filiallar.size());
    }
}
