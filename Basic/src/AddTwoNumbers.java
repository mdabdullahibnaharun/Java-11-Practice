import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String args[]){
        int x,y,z;
        System.out.print("Enter Two Integer to calculate Their sum : ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z =x+y;
        System.out.println("Sum of entered integers = "+z);
    }
}
