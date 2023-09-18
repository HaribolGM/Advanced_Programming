

// Program 4.4 : Get a socket's information.

import java.net.*;
import java.io.*;


public class program_4_4 {

    public static void main(String[] args) {


        try {
            Socket theSocket  = new Socket("www.google.com", 80);
            System.out.println("Connected to"
            + theSocket.getInetAddress()
            + "on port" + theSocket.getPort() + "from port"
            + theSocket.getLocalPort() + " of "
            + theSocket.getLocalAddress());

        }

        catch (UnknownHostException e) {
            System.err.println("I can't find https://www.google.com");

        }
        catch (SocketException e){
            System.err.println("Could not connect to https://www.google.com");

        }

        catch (IOException e) {
            System.err.println(e);

        }


    }  // end main

}  //  end  SocketInfo
