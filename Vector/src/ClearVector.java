import java.util.Vector;

public class ClearVector {
    public static void main(String[] args) {

        Vector<String> vct = new Vector<String>();

        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");

        System.out.println("Actual Vector : "+vct);

        vct.clear();

        System.out.println("After Clear Vector : " + vct);
    }
}
