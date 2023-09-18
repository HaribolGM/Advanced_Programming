//
//
//// Program 4.9 : Program for whois.
//
//
//
//import java.io.IOException;
//import java.net.SocketException;
//import org.apache.commons.net.whois.*;
//
//
//public class program_4_9 {
//    public static void main(String[] args) {
//        program_4_9 obj = new program_4_9();
//        System.out.println(obj.getWhoisInfo("google.com"));
//
//    }
//
//    public String getWhoisInfo(String domainName){
//        StringBuilder result = new StringBuilder("");
//        WhoisClient whois = new WhoisClient();
//        try {
//            //default is internic.net
//            whois.connect(WhoisClient.DEFAULT_HOST);
//            String s = whois.query("=" + domainName);
//            result.append(s);
//            whois.disconnect();
//
//        }
//
//        catch (SocketException e){
//            e.printStackTrace();
//        }
//
//        catch (IOException e){
//            e.printStackTrace();
//        }
//
//    }
//}