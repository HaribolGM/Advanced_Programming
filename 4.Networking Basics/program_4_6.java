//
//
//// Program 4.6 : TCP/IP communication between client and server. Sending a single message
//// from server to client.
//
//import java.net.*;
//import java.io.*;
//
//
//
//public class program_4_6 {
//
//    public static void main(String[] args) {
//
//        ServerSocket s = new ServerSocket(1254); // service on port 1254
//        System.out.println("Server Started , waiting for client connection...");
//        Socket s1 = s.accept();     // wait and accept a connection
//        OutputStream out = s1.getOutputStream(); //geta stream
//        DataOutputStream dos = new DataOutputStream(out);
//        dos.writeUTF("Hi there");
//        // close  the connection, but not the server socket
//        dos.close();
//        out.close();
//        s1.close();
//
//
//    }
//
//}
