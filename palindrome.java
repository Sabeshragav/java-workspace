
class palindrome {
    static boolean isPalindrome1(String str) {
        if (str.length() <= 1)
            return true;
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Half-length Iteration
    static boolean isPalindrome2(String str) {
        int len = str.length();
        int halfLen = len / 2;

        for (int i = 0; i < halfLen; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome1("racecar"));
        System.out.println(isPalindrome2("racecar"));

    }
}