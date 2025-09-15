//import java.net.InetAddress
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamCheckExample{

    private static final String DNBSL = "zen.spamhaus.org";

    public static void main(String[] args) {
        String ip = "127.0.0.2"; // test IP
        checkSpam(ip);
    }

    public static void checkSpam(String ip) {
        try {
            // split garxa 
            String[] addressParts = ip.split("\\.");

            // IP LAI reverse garxa
            StringBuilder reversedIP = new StringBuilder();
            for (int i = addressParts.length - 1; i >= 0; i--) {
                reversedIP.append(addressParts[i]);
                if (i != 0) {
                    reversedIP.append(".");
                }
            }

            // Build DNSBL query
            String query = reversedIP + "." + DNBSL;
            System.out.println("DNS Query: " + query);

            
            InetAddress.getByName(query);

            
            System.out.println(ip + " is BLACKLISTED");
        } catch (UnknownHostException e) {

            System.out.println(ip + " is NOT blacklisted.");
        }
    }
}
