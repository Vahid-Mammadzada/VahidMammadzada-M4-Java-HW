package Modul4HW2.Blok4;

public class Tapshiriq13 {
    public static void main(String[] args) {

        String metn = " Java proqramlaşdırma dili çox güclüdür! ";

        // Trim-dən əvvəl və sonra uzunluq — fərqi nədir?
        int uzunluqEvvel = metn.length();
        System.out.println("Trimdən əvvəl: " + uzunluqEvvel);
        int uzunluqSonra = metn.trim().length();
        System.out.println("Trimdən sonra: " + uzunluqSonra);
        int uzunluqFerq = uzunluqEvvel - uzunluqSonra;
        System.out.println("Fərq:          " + uzunluqFerq);
        // Trim stringdəki boşluqları silir. Trimdən əvvəlki vəziyyətdə stringin uzulunluğuna
        // boşluqlar da daxildir.

        // Java" sözü varmı? Böyük hərflə yazanda da varmı?

        boolean javaVarmi = metn.contains("Java");
        System.out.println("Java sözü varmı?            " + javaVarmi);

        boolean boyukJavaVarmi = metn.contains("JAVA");
        System.out.println("Böyük hərflə java  varmı?   " + boyukJavaVarmi);

        // "proqramlaşdırma" sözünü "programming" ilə əvəz edin

        String evezlenmis = metn.replace("proqramlaşdırma", "programming");
        System.out.println("Əvəzlənmiş mətn:           " + evezlenmis);

        // İlk 4 hərf nədir? (substring ilə)

        String ilk4Herf = metn.trim().substring(0,4); // Hərfləri istəndiyi üçün trim edirik.
        System.out.println("İlk 4 hərf:                 " + ilk4Herf);

        // "!" işarəsi varmı?

        boolean nidaVarmi = metn.contains("!");
        System.out.println(" ! işarəsi varmı?           " + nidaVarmi);

        // Bütün mətn kiçik hərflə, trim edilmiş şəkildə çap edin.

        String kicikTrimliMetn = metn.trim().toLowerCase();
        System.out.println("Kiçik hərflə, trim edilmiş: " + kicikTrimliMetn);






    }
}
