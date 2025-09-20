import java.net.MalformedURLException;
import java.net.URL;


public class URLExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://user:pass@www.google.com:8080/search?q=java+networking");

            String protocol = url.getProtocol();
            System.out.println("Protocol: " + protocol);

            String host = url.getHost();
            System.out.println("Host: " + host);

            int port = url.getPort();
            System.out.println("Port: " + port);

            String file = url.getFile();
            System.out.println("File: " + file);

            String authority = url.getAuthority();
            System.out.println("Authority: " + authority);

            String userInfo = url.getUserInfo();
            System.out.println("User Info: " + userInfo);

            String stringUrl = url.toString();
            System.out.println("URL: " + stringUrl);

        } catch (MalformedURLException e) {
            System.out.println("Error: " + e);
        }
    }
}



           
