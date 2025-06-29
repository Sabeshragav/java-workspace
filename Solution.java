import java.util.regex.Pattern;

class Solution {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from left

            while (left < right && !Pattern.matches("[a-zA-z0-9]", String.valueOf(s.charAt(left)))) {
                left++;
            }
            // Skip non-alphanumeric characters from right
            while (left < right && !Pattern.matches("[a-zA-z0-9]", String.valueOf(s.charAt(right)))) {
                right--;
            }
            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ab_a"));
    }
}