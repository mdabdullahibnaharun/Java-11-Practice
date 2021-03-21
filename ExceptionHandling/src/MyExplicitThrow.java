public class MyExplicitThrow {

    public static void main(String[] args) {
        try{
            MyExplicitThrow met = new MyExplicitThrow();

            System.out.println("Length of JUNK is"+met.getStringSize("JUNK"));

            System.out.println("Length of Wrong is "+met.getStringSize("Wrong"));

            System.out.println("Length of Wrong is "+met.getStringSize(null));

        }catch (Exception ex){
            System.out.println("Exception Message : "+ex.getMessage());
        }
    }

    public int getStringSize(String str)throws Exception{
        if(str==null){
            throw new Exception("String input is null");
        }
        return str.length();
    }

}
