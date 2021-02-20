import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        int n,index;
        Scanner sc = new Scanner(System.in);

        Vector<String> vct = new Vector<String>();

//        vct.add("First");
//        vct.add("Second");
//        vct.add("Third");
//        vct.add("Random");

        System.out.println("Vector Now :"+vct);

        System.out.print("Enter the size of vector : ");
        n = sc.nextInt();



        System.out.println("Enter The Elements of Vector :");
        for(index=0 ; index<n ; index++){
            //vct.remove(index);
            vct.add((String.format(String.valueOf(sc.nextInt()))));
        }

        System.out.println("The Elements are : ");
        for (index = 0 ; index<n ; index++){
            System.out.println(vct.get(index));
        }

        Collections.sort(vct);

        System.out.println("Sorted Elements are : ");
        for (index = 0 ; index<n ; index++){
            System.out.println(vct.get(index));
        }

        System.out.printf("Enter the index of element to remove : ");
        vct.remove(sc.nextInt());

        System.out.println("After Removing the remaining elements are : ");
        for (index = 0 ; index< vct.size(); index++){
            System.out.println(vct.get(index)+" ");
        }

    }
}
