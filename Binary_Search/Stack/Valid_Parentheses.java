package Binary_Search.Stack;



import java.util.Stack;

/**
 * Problem: https://leetcode.com/problems/valid-parentheses/
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * A string is valid if:
 * 1. Open brackets are closed by the same type of brackets.
 * 2. Open brackets are closed in the correct order.
 */
public class Valid_Parentheses {

    public static void main(String[] args) {
        String s = "()[]{}";

        boolean result = isValid(s);
        System.out.println(result); // Expected Output: true
    }

    /**
     * Checks if the input string has valid parentheses.
     * 
     * @param str Input string with parentheses
     * @return true if valid, false otherwise
     */
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // No matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check for matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets were matched properly
        return stack.isEmpty();
    }
}
