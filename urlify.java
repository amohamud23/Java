public class urlify {

    public static void main(String[] args) {
        // write your code here
        String str = "Mr John Smith";
        String added = "%20";
        String newString = new String();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {

                newString += added;

            } else {
                newString += str.charAt(i);
            }

        }

        System.out.println(newString);

    }
}