import java.util.HashMap;

public class find {
    // public int value = 0;
    private String key;
    private static HashMap<Character, Integer> map = new HashMap();
    private static boolean aBoolean = false;

    public static void main(String[] args) {
        // write your code here
        int value = 1;

        String str = "My name is Abdi. What is your name?";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                    aBoolean = true;
                } else {
                    map.put(str.charAt(i), value);
                }
                /// System.out.println(str.charAt(i));

            }
        }
        System.out.println(map);
    }
}