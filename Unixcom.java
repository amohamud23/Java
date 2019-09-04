import java.util.ArrayList;

public class Unixcom {

    public static void main(String[] args) {
        System.out.println(foo("Hello 'there my Name' is Abdi"));





    }

    public static ArrayList<String> foo(String str) {


        String str2 = "";
        char token = ' ';
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != token) {
                if (str.charAt(i) == '"') {
                    token = '"';
                    continue;
                }

                str2 += str.charAt(i);
            } else {
                arr.add(str2);
                token = ' ';
                str2 = " ";

            }


        }
        return arr;
    }
}