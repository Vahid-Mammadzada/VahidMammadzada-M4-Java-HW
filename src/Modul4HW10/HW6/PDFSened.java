package Modul4HW10.HW6;

public class PDFSened extends Sened {

    PDFSened(String baslik) {
        super(baslik);
    }

    @Override
    public void capEt() {
        System.out.println("Pdf sənəd çap olunur: " + baslik);
    }
}
