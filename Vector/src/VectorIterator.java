import java.util.Iterator;
import java.util.Vector;

public class VectorIterator {
    public static void main(String[] args) {

        Vector<String> vct = new Vector<String>();

        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");

        Iterator<String> itr = vct.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
