

package String.EASY;

public class Rotate_String {

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s, goal));  // Output: true
    }

    /**
     * Checks if the 'goal' string is a rotation of string 's'.
     * 
     * @param s     the original string
     * @param goal  the target string to compare against
     * @return      true if goal is a rotation of s
     */
    public static boolean rotateString(String s, String goal) {
        // Ensure strings are of equal length and check if goal is a substring of s+s
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
