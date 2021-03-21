public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        String languages[] = {"C","C++","Java","Go","python"};
        try{
            for(int i = 1 ; i<=5 ; i++ ){//4
                System.out.println(languages[i]);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
