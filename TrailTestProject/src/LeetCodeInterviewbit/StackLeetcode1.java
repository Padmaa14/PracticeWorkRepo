package LeetCodeInterviewbit;

import java.util.Stack;

public class StackLeetcode1 {
    //"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"   woorked
    public static void main(String[] args) { //
        String[] tokens = new String[]{"2","1","+","3","*"};
        int value=0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == "+" || tokens[i] == "-" || tokens[i] == "*" || tokens[i] == "/") {
                int val1 = stack.pop();
                int val2 = stack.pop();
                int val3 = 0;
                //pop two numbers do operation save ans in stack
                if (("+").equalsIgnoreCase(tokens[i])) {
                    val3 = val2 + val1;
                } else if (("-").equalsIgnoreCase(tokens[i])) {
                    val3 = val2 - val1;
                } else if (("*").equalsIgnoreCase(tokens[i])) {
                    val3 = val2 * val1;
                } else if (("/").equalsIgnoreCase(tokens[i])) {
                    val3 = val2 / val1;
                }
                stack.push(val3);
                val3 = 0;
            } else {
                value = Integer.parseInt(tokens[i]);
                stack.push(value);
            }

        }

        //Print
        System.out.println(stack);

    }
}
