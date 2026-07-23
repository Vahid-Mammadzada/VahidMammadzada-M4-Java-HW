package Modul4HW1.Blok_4;

public class tapshiriq19 {
    public static void main(String[] args) {

        String musteriAdi = "Vahid Mammadzada";
        int yas = 24;
        double ayliqGelir = 1000.0;
        double krediMeblegi = 8000.0;
        int muddet = 12;
        double illikFaiz = 15.0;
        boolean krediTarixiTemiz = true;

        System.out.println(" MÜŞTƏRİ MƏLUMATLARI ");
        System.out.println("Ad:              " + musteriAdi);
        System.out.println("Yaş:             " + yas);
        System.out.println("Aylıq gəlir:     " + ayliqGelir);
        System.out.println("Modul4HW10.HW5.Kredit məbləği:  " + krediMeblegi);
        System.out.println("Müddət (ay):     " + muddet);
        System.out.println("İllik faiz:      " + illikFaiz);

        double umumiFaiz = krediMeblegi * illikFaiz / 100;
        double ayliqOdenis = (krediMeblegi + umumiFaiz) / muddet;
        double gelireNisbet = (ayliqOdenis / ayliqGelir) * 100;

        System.out.println();
        System.out.println(" HESABLAMALAR ");
        System.out.println("Ümumi faiz:      " + umumiFaiz);
        System.out.println("Aylıq ödəniş:    " + ayliqOdenis);
        System.out.println("Gəlirə nisbət:   " + gelireNisbet + "%");

        boolean yasSerti = (yas >= 21 && yas <= 65);
        boolean gelirSerti = ayliqGelir > 800;
        boolean meblegSerti = (krediMeblegi >= 300 && krediMeblegi <= 50000);
        boolean nisbetSerti = gelireNisbet < 40;

        System.out.println();
        System.out.println(" YOXLAMALAR ");
        System.out.println("Yaş şərti:       " + yasSerti);
        System.out.println("Gəlir şərti:     " + gelirSerti);
        System.out.println("Məbləğ şərti:    " + meblegSerti);
        System.out.println("Nisbət şərti:    " + nisbetSerti);
        System.out.println("Modul4HW10.HW5.Kredit tarixi:   " + krediTarixiTemiz);

        boolean kreditTesdiqlenir = yasSerti && gelirSerti && meblegSerti && nisbetSerti && krediTarixiTemiz;

        System.out.println();
        System.out.println("KREDİT TƏSDİQLƏNİR: " + kreditTesdiqlenir);


    }

}
