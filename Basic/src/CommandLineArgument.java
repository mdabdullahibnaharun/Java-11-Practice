public class CommandLineArgument {
    public static void main(String args[]) {
        int a=5,b=5,c=4;
        //a= Integer.parseInt(args[0]);
        //b= Integer.parseInt(args[1]);
        //c= Integer.parseInt(args[2]);

        if(a>b && a>c){
            System.out.println("Largest Number is "+a);
        }
        else if(b>c){
            System.out.println("Largest number is "+b);
        }
        else{
            System.out.println("Largest Number is "+c);
        }
    }
}
