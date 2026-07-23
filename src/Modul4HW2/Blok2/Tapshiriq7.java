package Modul4HW2.Blok2;

public class Tapshiriq7 {
    public static void main(String[] args) {

        double temp = 36.8;
        int suret = 95, yanacaq =0;
        boolean aktiv = false;
        double balans = -50.0;
        String ad = "Anar";
        int yas = 22;

        boolean tempUygun = (temp > 36 && temp < 37.5); // "Temperatur 36-dan çox, 37.5-dən azdır"
        System.out.println("Temperatur 36-dan çox, 37.5-dən azdır:                      " + tempUygun );

        boolean suretYanacaqUygun = ((0 < suret && suret < 120) || (yanacaq > 0)); // "Sürət 0-dan çox, 120-dən az VƏ YA yanacaq 0-dan çoxdur: "
        System.out.println("Sürət 0-dan çox, 120-dən az VƏ YA yanacaq 0-dan çoxdur:     " + suretYanacaqUygun);

        boolean hesabBalansVeziyyeti = ( !aktiv || balans < 0 ); // "Modul4HW10.HW5.Hesab aktiv deyil VƏ ya balans mənfidir"
        System.out.println("Modul4HW10.HW5.Hesab aktiv deyil VƏ ya balans mənfidir:                    " + hesabBalansVeziyyeti);

        boolean adYasUygun = ( ad.length() > 0 && yas > 18); // "Ad boş deyil (uzunluğu 0-dan çoxdur) VƏ yaş 18-dən böyükdür"
        System.out.println("Ad boş deyil (uzunluğu 0-dan çoxdur) VƏ yaş 18-dən böyükdür " + adYasUygun);


    }
}
