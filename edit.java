public class edit {

    public static void main(String[] args) {

        String str1 = "pale";
        String str2 = "palea";

        System.out.println(checkedit(str1, str2));

    }

    public static boolean checkedit(String word1, String word2) {
        boolean change = false;
        int i = 0;
        try {
            while (i < word1.length()) {

                if (word1.charAt(i) == word2.charAt(i))
                    change = false;
                if (word1.length() != word1.length())
                    change = true;
                else {
                    change = true;
                    break;
                }
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            change = true;
        }
        return change;
    }

}