import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.net.SocketException;

public class NetworkInterfaceExample {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> addresses = NetworkInterface.getNetworkInterfaces();

            while (addresses.hasMoreElements()) {
                NetworkInterface address = addresses.nextElement();

                if (address.isLoopback()) {
                    System.out.println(address);
                }
            }

            NetworkInterface ni = NetworkInterface.getByName("loopback_0");
              Enumeration<InetAddress> ia = ni.getInetAddresses();

            while (ia.hasMoreElements()) {
                InetAddress add = ia.nextElement();

                System.out.println(add);
            }
        } catch (SocketException e) {
            System.out.println(e);
        }
    }
}