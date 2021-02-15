
import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Character grade = 'A';

        Scanner sc  = new Scanner(System.in);

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("wll done");
                break;
            case 'D':
                System.out.println("You Passed");
                break;
            case 'F':
                System.out.println("Better Try Again");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }


    }
}
