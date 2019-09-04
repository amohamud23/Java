import java.util.Stack;

public class Stacks {

    public static void main(String[] args){


        Stack<Integer> stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        char c = '}';
        System.out.println(Integer.valueOf(c));
        isValid("{[]}");



    }

    public static boolean isValid(String str) {

        //Stack
        // {[
        // check
        // ]}
        Stack<Character> stack = new Stack<>();
        if(str.length()%2 != 0)
            return false;
        for(int i = 0; i < str.length()/2; i++){
            stack.push(str.charAt(i));
        }
        for(int i = (str.length()/2); i < str.length(); i++)
        {

            if(Integer.valueOf(stack.pop())+2 != str.charAt(i))
                return false;
        }

        return true;
    }

    public static void print(Stack s){

        while(!s.empty()){

            System.out.println(s.pop());
        }

    }

    public static int postfix(String str){

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++){

            char c = str.charAt(i);
            if (Character.isDigit(c))
                stack.push(c - '0');
            else if (Character.isSpace(c))
                continue;
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;

                    case '-':
                        stack.push(val2 - val1);
                        break;

                    case '/':
                        stack.push(val2 / val1);
                        break;

                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static int prefix(String str){

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++){

            char c = str.charAt(i);
            if (Character.isDigit(c))
                stack.push(c - '0');

        }

return 0;
    }
}
