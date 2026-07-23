package Modul4HW10.HW2;

public class EmailBildiris extends Bildiris {
    @Override
    public void gonder() {
        super.gonder();
        System.out.println("Email bildirişi göndərildi.");
    }
}
