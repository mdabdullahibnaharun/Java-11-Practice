import java.io.*;
import java.io.InputStreamReader;

public class BufferReaderExmple {
    public static void main(String[] args) throws Exception {
        String str;
        int i;
        float f;
        double d;
        long l;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String: ");
        str = br.readLine();
        System.out.println("Enter Integer: ");
        i = Integer.parseInt(br.readLine());
        System.out.println("Enter Float : ");
        f = Float.parseFloat(br.readLine());
        System.out.println("Enter Double : ");
        d = Double.parseDouble(br.readLine());

        System.out.println("String "+str);
        System.out.println("Integer "+i);
        System.out.println("Float "+f);
        System.out.println("Double "+d);


    }
}
