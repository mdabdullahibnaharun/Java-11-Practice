import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        int x = 30;

        Scanner sc = new Scanner(System.in);
        x = Integer.parseInt(sc.nextLine());

        if(x==10){
            System.out.println(" Value of x is : 10");
        }
        if(x==20){
            System.out.println(" Value of x is : 20");
        }
        if(x==30){
            System.out.println(" Value of x is : 30");
        }
        else{
            System.out.println("Value of x is : "+x);
        }
    }
}
