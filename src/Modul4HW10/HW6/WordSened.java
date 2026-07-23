package Modul4HW10.HW6;

public class WordSened extends Sened {

    WordSened(String baslik) {
        super(baslik);
    }

    @Override
    public void capEt() {
        System.out.println("Word sənəd çap olunur: " + baslik);
    }
}
