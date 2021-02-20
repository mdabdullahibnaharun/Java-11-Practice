import java.util.Vector;

public class VectorClone {
    public static void main(String[] args) {
        Vector<String> vct = new Vector<>();

        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");

        System.out.println("Äctual Vector : "+vct );

        Vector<String> copy = (Vector<String>)vct.clone();

        System.out.println("Cloned Vector : "+copy);

    }
}
