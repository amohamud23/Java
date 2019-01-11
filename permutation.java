public class permutation {

    public static void main(String args[]) {

        boolean perm = false;

        String str1 = "tea";
        String str2 = "Eat";

        if (compare(str1) == compare(str2))
            perm = true;

        System.out.println(compare(str1) + " " + compare(str2) + " " + perm);

    }

    public static int compare(String word) {

        int sum = 0;

        for (int i = 0; i < word.length(); i++) {

            sum = sum + Character.getNumericValue(word.charAt(i));
        }

        return sum;
    }
}
