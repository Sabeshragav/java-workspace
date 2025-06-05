import java.util.*;

class Solution {
    public static int romanToInt(String s) {
        Map<Character, Integer> num = new LinkedHashMap<>();
        char[] romanSymbols = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] values = { 1, 5, 10, 50, 100, 500, 1000 };

        // Iteratively insert into the HashMap
        for (int i = 0; i < romanSymbols.length; i++) {
            num.put(romanSymbols[i], values[i]);
        }

        // Initialize result
        int result = 0;

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            // Get the integer value of the current Roman numeral
            int current = num.get(s.charAt(i));

            // Check if the next numeral exists and is larger (subtraction rule)
            if (i < s.length() - 1 && current < num.get(s.charAt(i + 1))) {
                result -= current; // Subtract the current value
            } else {
                result += current; // Otherwise, add the current value
            }
        }

        System.out.println(result);
        return 0;
    }

    public static void main(String[] args) {

        romanToInt("IV");
    }
}