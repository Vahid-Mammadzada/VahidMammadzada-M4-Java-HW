import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int umumiXerc = 1240;

        try {
            System.out.print("Əməliyyat sayını daxil edin: ");
            int emeliyyat = sc.nextInt();

            double ortaEmeliyyat = (double) umumiXerc / emeliyyat;
            System.out.print("Orta əməliyyat məbləği: " + ortaEmeliyyat + " AZN ");
        } catch (ArithmeticException e) {
            System.out.println("Xəta: Sıfıra bölmək olmaz!");
        } catch (Exception e) {
            System.out.println("Naməlum xəta baş verdi!");
        } finally {
            System.out.println("Hesabat tamamlandı!");
        }
        sc.close();
    }
}
