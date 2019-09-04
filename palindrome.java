public class palindrome {


    public static void main(String args[])
    {

        String str = "race;&car";
        String reverse = "";
        String temp = "";

        for (int i = 0; i < str.length(); i++){
            if (Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)))
            {
                temp += str.charAt(i);
            }
            if (Character.isLetter(str.charAt((str.length()-1)-i)) || Character.isDigit(str.charAt((str.length()-1)-i)))
            {
                reverse += str.charAt((str.length()-1)-i);
            }
        }

        if (temp.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");

        System.out.println(temp + " \n" + reverse);
    }
}
