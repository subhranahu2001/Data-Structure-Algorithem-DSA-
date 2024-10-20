package DailyQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BooleanExpression {

    public static boolean parseBoolean(String expression) {

        Stack<Character> stack = new Stack<>();
        int n = expression.length();
        for (int i = 0; i < n ; i++) {
            char ch = expression.charAt(i);
            if (ch == ')' ) {
                ArrayList<Character> list = new ArrayList<>();
                while(stack.peek() != '(') {
                    list.add(stack.pop());
                }
                stack.pop(); // remove opening (
                char op = stack.pop();
                char ans = evaluate(list,op);
                stack.push(ans);

            } else {
                if (ch != ',') {
                    stack.push(ch);
                }
            }
        }
            return stack.peek() != 'f';
    }

    private static char evaluate(List<Character> list, char op) {
        if (op == '&') {
            if (find(list,'f')) {
                return 'f';
            } else return 't';
        } else if (op == '|') {
            if (find(list,'t')) {
                return 't';
            } else return 'f';
        } else {
            return list.get(0) == 't' ? 'f' : 't';
        }
    }

    public static boolean find(List<Character> list,char val) {
        for (char ch : list) {
            if (ch == val) {
                return true;
            }
        }
        return false;
    }


}
