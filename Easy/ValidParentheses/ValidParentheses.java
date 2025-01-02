package ValidParentheses;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid(")(((())))"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            try {
                switch (s.charAt(i)) {
                    case '(':
                        stack.add('(');
                        break;
                    case '[':
                        stack.add('[');
                        break;
                    case '{':
                        stack.add('{');
                        break;
                    case ')':
                        if (!checkIfHasPair(stack, stack.peek(), '(', ')', '[', '{'))
                            return false;
                        break;
                    case ']':
                        if (!checkIfHasPair(stack, stack.peek(), '[', ']', '(', '{'))
                            return false;
                        break;
                    case '}':
                        if (!checkIfHasPair(stack, stack.peek(), '{', '}', '(', '['))
                            return false;
                        break;
                }
            } catch (java.util.EmptyStackException e) {
                return false;
            }
        }
        return stack.isEmpty();

    }

    public static boolean checkIfHasPair(Stack<Character> stack, char top, char left, char right, char a, char b) {
        if (top == left)
            stack.pop();
        else if (top == a || top == b)
            return false;
        else
            stack.add(right);

        return true;
    }

}
