import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        int a,b,result;

        Scanner input = new Scanner(System.in);

        a= input.nextInt();
        b= input.nextInt();

        try{
            result = a/b;
            System.out.println("Result = "+result);
        }catch (ArithmeticException aex){
            System.out.println("Exception Caught Division by zero");
            aex.printStackTrace();
        }
    }
}
