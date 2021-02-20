import java.util.Vector;

public class BasicVectorOperation {

    public static void main(String[] args ) {
        Vector<String> vct = new Vector<String>();

        vct.add("First");
        vct.add("Second");
        vct.add("Third");

        System.out.println(vct);

        vct.add(2,"Random");

        System.out.println(vct);

        System.out.println("Element of index 3 is : "+vct.get(3));

        System.out.println("First Element of this vector : "+vct.firstElement());

        System.out.println("Last Element of this vector : "+vct.lastElement());

        System.out.println("Is this vector is empty ? "+vct.isEmpty());

    }

}
