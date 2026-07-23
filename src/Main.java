public class Main {
    public static void main(String[] args) {

        Test[] testler = {new UITest(), new APITest(), new DBTest()};

        for (Test t : testler) {
            t.icraEt();

        }
    }
}
