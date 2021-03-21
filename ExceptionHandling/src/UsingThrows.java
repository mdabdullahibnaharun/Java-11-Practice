import java.io.IOException;

public class UsingThrows {
    void m() throws IOException
    {
        throw new IOException("Device error");
    }
    void n() throws IOException
    {
        m();
    }
    void p()
    {
        try{
            n();
        }catch (Exception e){
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        UsingThrows obj = new UsingThrows();
        obj.p();
        System.out.println("normal flow.........");
    }
}
