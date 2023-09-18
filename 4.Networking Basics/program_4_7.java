

// Program 4.7 : Program to send number from client and server will reply number as even
// or odd .

// client odd Even program



import java.net.*;
import java.io.*;


public class program_4_7 {

    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 1000);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter no : ");
            int n = Integer.parseInt(br.readLine());
            OutputStream o = s.getOutputStream();
            PrintStream ps = new PrintStream(o);
            ps.println(n);
            BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
            int c = br1.read();
            while (c != -1) {
                System.out.println((char) c);
                c = br1.read();

            }
        }
            catch(Exception e){

            }
        }
    }





