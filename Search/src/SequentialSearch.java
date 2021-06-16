import java.util.*;

public class SequentialSearch {

    public static void main(String[] args) {
        int[] array ;
        int searchValue = 0, n;
        int index =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of elements : ");
        n = scanner.nextInt();

        array = new int[n];


        System.out.println("Enter "+n+" numbers > ");


        for(int i = 0 ; i<array.length ; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter A number for search > ");
        searchValue = scanner.nextInt();

        //Arrays.sort(intArray,0,10);
        int c = 0;
        for(c = 0 ; c< array.length ; c++){
            if(array[c]==searchValue) {
                System.out.println(searchValue + " is present at location " + (c + 1) + ".");
                break;
            }
        }
        if(c==n){
            System.out.println(searchValue + " is not present at location in Array");
        }


    }
}
