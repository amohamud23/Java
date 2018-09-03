import java.net.*;
import java.io.*;

public class url   {
    public static void main(String[] args)  throws Exception{
        
        URL aUrl = new URL("http://www.mail.yahoo.com");

        System.out.println(aUrl.getHost()); 

    }


}