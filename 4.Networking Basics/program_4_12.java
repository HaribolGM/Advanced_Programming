

// Program 4.12 : Read the content from a URL

import java.net.*;
import java.io.*;


public class program_4_12 {
    public static void main(String[] args) {

        try{
            URL url  = new URL("http://www.google.com");
            URLConnection con=url.openConnection();
            InputStream stream=con.getInputStream();
            int i;

            while((i=stream.read())!=-1){
                System.out.print((char) i);

            }
        }
        catch (Exception e) {}

    }

}
