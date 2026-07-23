public class Main {
    public static void main(String[] args) {

        System.out.println("--Bildiriş--");
        Bildiris b = new Bildiris();
        b.gonder();


        System.out.println("--Email bildirişi--");
        EmailBildiris e = new EmailBildiris();
        e.gonder();


        System.out.println("--Təcili email bildirişi--");
        TeciliEmailBildiris t = new TeciliEmailBildiris();
        t.gonder();

    }
}
