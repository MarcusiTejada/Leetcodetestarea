package Easy_difficulty;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        boolean answer = false;

        if (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')' || s.length() == 1) {
            i = s.length();
        }

        for (; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                answer = true;
            } else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
                answer = true;
            } else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
                answer = true;
            } else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
                answer = true;
            } else {
                answer = false;
                i = s.length();
            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}

