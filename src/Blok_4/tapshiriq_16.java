package Blok_4;

public class tapshiriq_16 {
    public static void main(String[] args) {

        String metn = " Salam, ABB Bank! ";
        int uzunluqTrimsiz = metn.length();
        System.out.println("Uzunluq trimsiz: " + uzunluqTrimsiz);

        String  metnTrim = metn.trim();
        int uzunluqTrim = metnTrim.length();
        System.out.println("Uzunluq trim sonrası: " + uzunluqTrim);

        String boyukHerfle = metn.toUpperCase();
        System.out.println("Böyük hərflə: " + boyukHerfle);

        String kicikHerfle = metn.toLowerCase();
        System.out.println("Kiçik hərflə " + kicikHerfle);

        boolean varABB = metn.contains("ABB");
        System.out.println("ABB varmı?: " + varABB);

        boolean varbank = metn.contains("bank");
        System.out.println("bank varmı?: " + varbank);

        String evezleme =metn.replace("Bank", "Kredit");
        System.out.println("Bankı Kreditlə əvəzlə: " + evezleme);

        boolean basliyirSalam =metnTrim.startsWith("Salam");
        System.out.println("Trimdən sonra Salam ilə başlayırmı?: " + basliyirSalam);


    }
}
