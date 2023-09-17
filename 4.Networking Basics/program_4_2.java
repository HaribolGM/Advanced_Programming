

// Program 4.2 : Get all the IP addresses associated with host.

import  java.net.*;

public class program_4_2 {

    public static void main(String[] args) {

        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
            address = InetAddress.getByName("www.google.com");
            System.out.println(address);
            InetAddress sw[] = InetAddress.getAllByName("www.yahoo.com");
            for (int i = 0; i < sw.length; i++) {
                System.out.println(sw[i]);
            }
        }
            catch(Exception e){
                System.out.println(e);
            }



    }

}
