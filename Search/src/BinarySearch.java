import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        int[] intArray = new int[10];
        int searchValue = 0;
        int index =0;

        System.out.println("Enter 10 numbers > ");
        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i<intArray.length ; i++){
            intArray[i] = scanner.nextInt();
        }

        System.out.println("Enter A number for search > ");
        searchValue = scanner.nextInt();

        Arrays.sort(intArray,0,10);

        index = binarySearch(intArray,searchValue);

        if(index!=-1){
            System.out.println("Found At : "+index);
        }else {
            System.out.println("Not Found");
        }

    }


    static int binarySearch(int[] search,int find){
        int start,end,midPt;
        start = 0;
        end = search.length - 1;

        while (start<=end){
            midPt = (start+end)/2;

            if(search[midPt]==find){
                return midPt;
            }
            else if(search[midPt]<find){
                start = midPt+1;
            }
            else {
                end = midPt-1;
            }
        }
        return -1;
    }

}
