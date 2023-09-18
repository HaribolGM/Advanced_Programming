

// Program 4.10 : Display the parts of a URL.


import java.net.MalformedURLException;
import java.net.URL;

public class program_4_10 {
    public static void main(String[] args) {

        try {
            URL hp = new URL("http://www.yahoo.com:80/index");
            System.out.println(hp.getProtocol());
            System.out.println(hp.getPath());
            System.out.println(hp.getHost());
            System.out.println(hp.getFile());
            System.out.println(hp.getPort());

        }
        catch (MalformedURLException e){

        }
    }
}
