import java.net.*;
import java.io.*;
import java.lang.*;
import java.util.Stack;


public class url   {
    public static void main(String[] args)  throws Exception{
         int j =0;
         //int counter = 0;
         String domain = "";
        URL aUrl = new URL("http://www.mail.yahoo.com");
        String str = aUrl.getHost();

        System.out.println(str); 

        for (int i = 0; i < str.length(); i++)
            {
                  if (str.charAt(i) == '.')
                    {
                      j = i-1;  
                      
                    }
                    

            }
                Stack<Character> st = new Stack<Character>();
        while (str.charAt(j) != '.')
            {
                st.push(str.charAt(j));
                //counter++;
                j--;
                

            
            }
            while (!st.empty())
                {
                    domain = domain + st.pop();
                }

            System.out.println(domain);
       

    }


}