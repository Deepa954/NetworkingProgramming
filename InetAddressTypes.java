
// import java.net.InetAddress;
// import java.net.UnknownHostException;

// public class InetAddressTypes {
//     public static void main(String[] args) {
//         try {
//             // InetAddress address = InetAddress.getByName("www.google.com"); // This gives false
//             InetAddress address = InetAddress.getByName("0.0.0.0"); // This gives true

//             System.out.println("Host Address: " + address.getHostAddress());
//             System.out.println("Is Any Local Address? " + address.isAnyLocalAddress());
//         } catch (UnknownHostException e) {
//             e.printStackTrace();
//         }
//     }
// }




// // 0.0.0.0 wildcard address(any local address)
// // If device not assigned with any ip address
// If device wants to link all interface


import java.net.InetAddress;
import java.net.UnknownHostException;

// public class InetAddressTypes {
//     public static void main(String[] args) {
//         try {
//             // InetAddress address = InetAddress.getByName("www.google.com"); // This gives false
//             InetAddress address = InetAddress.getByName("127.0.0.1"); // This gives true
//  System.out.println("Host Address: " + address.getHostAddress());
//             System.out.println("Is Any Local Address: " + address.isAnyLocalAddress());
//             System.out.println("Is Loopback Address? " + address.isLoopbackAddress());
//         } catch (UnknownHostException e) {
//             e.printStackTrace();
//         }
//     }
// }


// public class InetAddressTypes {

//     // IPV6 FE
//     public static void main(String[] args) {
//         try {
//             // InetAddress address = InetAddress.getByName("www.google.com"); // This gives false
//             InetAddress address = InetAddress.getByName("169.254.0.1"); // This gives true
//  System.out.println("Host Address: " + address.getHostAddress());
//             System.out.println("Is Any Local Address: " + address.isAnyLocalAddress());
//             System.out.println("Is Loopback Address? " + address.isLoopbackAddress());
//             System.out.println("Is Link Address? " + address.isLinkLocalAddress());
            

//         } catch (UnknownHostException e) {
//             e.printStackTrace();
//         }
//     }
// }

// Link Local Address 
// FE80:0000:0000:0000


// Site local Address 
// 224.0.0.0 to 224.0.0.255

// 10.0.0.0 to 10.255.255.255
// 172.16.0.0 to 172.31.255.255
// 192.168.0.0 to 192.168.255.255


// ismulticastrangeaddress

public class InetAddressTypes {

    // IPV6 FE
    public static void main(String[] args) {
        try {
            // InetAddress address = InetAddress.getByName("www.google.com"); // This gives false
            InetAddress address = InetAddress.getByName("224.0.0.0"); // This gives true
             System.out.println("Host Address: " + address.getHostAddress());
            System.out.println("Is Any Local Address: " + address.isAnyLocalAddress());
            System.out.println("Is Loopback Address? " + address.isLoopbackAddress());
            System.out.println("Is Link Address? " + address.isLinkLocalAddress());
            System.out.println("Is Site Local Address? " + address.isSiteLocalAddress());

            

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}