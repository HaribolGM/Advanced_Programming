

// Program 4.5 : Scanner for the server ports. In following example, if you try to connect
// server socket on a particular port which is already occupied by other applications then code will throw the exception
// and you will get the message that "There is a server..."


import java.net.*;
import java.io.*;



public class program_4_5 {

    public static void main(String[] args) {
        for (int port = 1;  port <= 65535 ; port ++) {

            try {
                ServerSocket server = new ServerSocket(port);

            }
            catch (IOException ex) {
                System.out.println("There is a server on port " + port + " . ");

            }
        }
    }


}
