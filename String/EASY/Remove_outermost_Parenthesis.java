

package String.EASY;

/**
 * Problem: https://leetcode.com/problems/remove-outermost-parentheses/
 *
 * A valid parentheses string is either:
 * - "()" 
 * - or a concatenation of two valid strings
 * - or wrapped around another valid string: "(A)"
 * 
 * The task is to remove the outermost parentheses of every primitive string.
 */
public class Remove_outermost_Parenthesis {

    public static void main(String[] args) {

        String s = "(()())(())";  // Input string
        StringBuilder result = new StringBuilder();  // To store final answer

        int count = 0;  // Track depth of parentheses

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count != 0) {
                    result.append(ch);  // Not outermost, include
                }
                count++;  // Increase depth
            } else {  // ch == ')'
                count--;  // Decrease depth first
                if (count != 0) {
                    result.append(ch);  // Not outermost, include
                }
            }
        }

        System.out.println(result.toString());  // Output: "()()()"
    }
}
