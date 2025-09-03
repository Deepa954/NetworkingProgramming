
import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressGetterMethod {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.example.com");

            System.out.println("Host Name: " + address.getHostName());
            System.out.println("Canonical Host Name: " + address.getCanonicalHostName());
            System.out.println("IP Address (byte[]): " + Arrays.toString(address.getAddress()));
            System.out.println("Host Address: " + address.getHostAddress());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




// DNS host adress dithiyo   Canonical Host use garnna 