public class FaylMenecer implements Yuklene,Endirile{
    @Override
    public void endir() {
        System.out.println("Fayl endirilir...");
    }

    @Override
    public void yukle() {
        System.out.println("Fayl yüklənir...");
    }
}
