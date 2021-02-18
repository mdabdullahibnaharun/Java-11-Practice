public class ContinueExample {
    public static void main(String[] args) {
        int [] numbers = {58,20,35,40,68,55,30,50,56};
        for(int x : numbers){
            if(x%2==0){
                continue;
            }
            System.out.println(x);
        }
    }
}
