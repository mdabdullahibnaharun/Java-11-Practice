import java.util.Vector;

public class CopyVectorToArray {

    public static void main(String[] args) {

        Vector<String> vct = new Vector<String>();

        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");

        System.out.println("Actual Vector : "+vct);

        String[] cpyArr = new String[vct.size()];

        vct.copyInto(cpyArr);

        System.out.println("Copied Array Content :");

        for(String str:cpyArr){
            System.out.println(str);
        }
    }
}
