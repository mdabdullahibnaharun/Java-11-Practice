import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {
    public static void main(String[] args) {
        try{
            InetAddress ipAddr = InetAddress.getLocalHost();
            System.out.println("Ip Address of this machine : "+ipAddr.getHostAddress());
            System.out.println("Host Name of this machine : "+ipAddr.getHostName());
            System.out.println("Canonical Host Name of this machine : "+ipAddr.getCanonicalHostName());
            System.out.println("Address of this machine : "+ipAddr.getAddress());
        }catch (UnknownHostException ex){
            ex.printStackTrace();
        }
    }
}
