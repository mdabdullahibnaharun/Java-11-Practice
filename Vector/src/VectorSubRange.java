import java.util.List;
import java.util.Vector;

public class VectorSubRange {
    public static void main(String[] args) {
        Vector<String> vct = new Vector<String>();

        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");

        System.out.println("Actual Vector : "+vct);

        List<String> list = vct.subList(2,4);

        System.out.println("Sub List : "+list);

    }
}
