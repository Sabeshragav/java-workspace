
// class StringMethodsDemo {
//     public static void main(String[] args) {
//         // Initialize a string for demonstration
//         String original = " Hello, World! ";

//         // 1. length(): Returns the length of the string
//         System.out.println("Length of the string: " + original.length());

//         // 2. trim(): Removes leading and trailing whitespace
//         String trimmed = original.trim();
//         System.out.println("Trimmed string: '" + trimmed + "'");

//         // 3. toUpperCase(): Converts all characters to uppercase
//         String upperCase = original.toUpperCase();
//         System.out.println("Uppercase string: " + upperCase);

//         // 4. toLowerCase(): Converts all characters to lowercase
//         String lowerCase = original.toLowerCase();
//         System.out.println("Lowercase string: " + original.toLowerCase());

//         // 5. charAt(index): Returns the character at the specified index
//         char charAt5 = original.charAt(5);
//         System.out.println("Character at index 5: " + charAt5);

//         // 6. substring(startIndex, endIndex): Returns a substring from startIndex to
//         // endIndex
//         String subString = original.substring(7, 12);
//         System.out.println("Substring from index 7 to 12: " + subString);

//         // 7. indexOf(char): Returns the index of the first occurrence of the specified
//         // character
//         int indexOfW = original.indexOf('W');
//         System.out.println("Index of 'W': " + indexOfW);

//         // 8. lastIndexOf(char): Returns the index of the last occurrence of the
//         // specified character
//         int lastIndexOfW = original.lastIndexOf('W');
//         System.out.println("Last index of 'W': " + lastIndexOfW);

//         // 9. contains(CharSequence): Checks if the string contains the specified
//         // sequence
//         boolean containsWorld = original.contains("World");
//         System.out.println("Contains 'World': " + containsWorld);

//         // 10. replace(oldChar, newChar): Replaces occurrences of oldChar with newChar
//         String replaced = original.replace('o', '0');
//         System.out.println("String after replacement: " + replaced);

//         // 11. split(regex): Splits the string into an array of substrings based on the
//         // regex
//         String[] words = original.split(" ");
//         System.out.println("Words after split:");
//         for (String word : words) {
//             System.out.println("'" + word + "'");
//         }

//         // 12. equals(otherString): Compares the string with another string for equality
//         boolean isEqual = original.equals(" Hello, World! ");
//         System.out.println("Strings are equal: " + isEqual);

//         // 13. startsWith(prefix): Checks if the string starts with the specified prefix
//         boolean startsWithHello = original.startsWith(" Hello");
//         System.out.println("Starts with ' Hello': " + startsWithHello);

//         // 14. endsWith(suffix): Checks if the string ends with the specified suffix
//         boolean endsWithWorld = original.endsWith("World! ");
//         System.out.println("Ends with 'World! ': " + endsWithWorld);

//         // 15. format(formatString, args...): Returns a formatted string using the
//         // specified format
//         String formatted = String.format("Formatted number: %.2f", 123.456);
//         System.out.println(formatted);

//         // 16. valueOf(boolean/char/int/float): Converts different types to their string
//         // representation
//         String valueOfInt = String.valueOf(123);
//         String valueOfBoolean = String.valueOf(true);
//         String valueOfChar = String.valueOf('A');
//         String valueOfFloat = String.valueOf(123.45f);

//         // System.out.printf("Value = %s\n", valueOfBoolean);
//         System.out.println("Value of int: " + valueOfInt + " " + valueOfInt.getClass().getSimpleName());
//         System.out.println("Value of boolean: " + valueOfBoolean + " " + valueOfBoolean.getClass().getSimpleName());
//         System.out.println("Value of char: " + valueOfChar + " " + valueOfChar.getClass().getSimpleName());
//         System.out.println("Value of float: " + valueOfFloat + " " + valueOfFloat.getClass().getSimpleName());
//     }
// }

public class StringMethodsDemo {
    public static void main(String[] args) {
        // Example 1: String Length and Character Access
        String str1 = "Hello, World!";
        System.out.println("Example 1: String Length and Character Access");
        System.out.println("Length of the string: " + str1.length());
        System.out.println("Character at index 7: " + str1.charAt(7));
        System.out.println();

        // Example 2: Substring Methods
        String str2 = "Java Programming";
        System.out.println("Example 2: Substring Methods");
        String sub1 = str2.substring(5); // From index 5 to end
        String sub2 = str2.substring(0, 4); // From index 0 to 4 (exclusive)
        System.out.println("Substring from index 5: " + sub1);
        System.out.println("Substring from index 0 to 4: " + sub2);
        System.out.println();

        // Example 3: String Comparison
        String str3 = "Hello";
        String str4 = "hello";
        System.out.println("Example 3: String Comparison");
        System.out.println("str3 equals str4: " + str3.equals(str4));
        // Case-sensitive
        System.out.println("str3 equals str4 (ignore case): " +
                str3.equalsIgnoreCase(str4)); // Case-insensitive
        System.out.println();

        // Example 4: String Searching
        String str5 = "Java programming is fun";
        System.out.println("Example 4: String Searching");
        int index = str5.indexOf("programming");
        System.out.println("Index of 'programming': " + index);
        int lastIndex = str5.lastIndexOf('a');
        System.out.println("Last index of 'a': " + lastIndex);
        System.out.println();

        // Example 5: String Modification
        String str6 = " Hello, World! ";
        System.out.println("Example 5: String Modification");
        String trimmed = str6.trim();
        String upper = trimmed.toUpperCase();
        String replaced = trimmed.replace("World", "Java");
        System.out.println("Trimmed: '" + trimmed + "'");
        System.out.println("Uppercase: '" + upper + "'");
        System.out.println("Replaced: '" + replaced + "'");
        System.out.println();

        // Example 6: String Splitting and Joining
        String str7 = "Java,Python,C++,JavaScript";
        System.out.println("Example 6: String Splitting and Joining");
        String[] languages = str7.split(",");
        System.out.println("Languages:");
        for (String lang : languages) {
            System.out.println(lang);
        }
        String joined = String.join(" & ", languages);
        System.out.println("Joined: " + joined);
        System.out.println();

        // Example 7: Checking String Properties
        String str8 = "Hello";
        System.out.println("Example 7: Checking String Properties");
        System.out.println("Is the string empty? " + str8.isEmpty());
        System.out.println("Contains 'ell'? " + str8.contains("ell"));
        System.out.println("Starts with 'He'? " + str8.startsWith("He"));
        System.out.println("Ends with 'lo'? " + str8.endsWith("lo"));
        System.out.println();

        // Example 8: String Formatting
        String name = "Alice";
        int age = 25;
        System.out.println("Example 8: String Formatting");
        String formattedString = String.format("My name is %s and I am %d yearsold.", name, age);
        System.out.println(formattedString);
    }
}
