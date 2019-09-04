public class compression {

    public static void main(String args[]){

        String str = "aaaabbbccdeeeeee";
        String result = "";
        int j = 0;

        for (int i = 0; i < str.length(); i++)
        {
            int count = 0;

            while(str.charAt(i) == str.charAt(j))
            {
                count++;
                j++;
            }

            i = j-1;

            result = result + str.charAt(i) + Integer.toString(count);

        }
    }
}
