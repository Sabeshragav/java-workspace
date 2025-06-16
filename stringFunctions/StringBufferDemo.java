
package stringFunctions;

public class StringBufferDemo {
    public static void main(String[] args) {
        // Example 1: Creating a StringBuffer
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println("Example 1: Creating a StringBuffer");
        System.out.println("Original StringBuffer: " + sb1);
        System.out.println();

        // Example 2: Appending Strings
        sb1.append(", World!");
        System.out.println("Example 2: Appending Strings");
        System.out.println("After appending: " + sb1);
        System.out.println();

        // Example 3: Inserting Strings
        sb1.insert(5, " Beautiful");
        System.out.println("Example 3: Inserting Strings");
        System.out.println("After inserting: " + sb1);
        System.out.println();

        // Example 4: Replacing Strings
        sb1.replace(5, 15, "Awesome");
        System.out.println("Example 4: Replacing Strings");
        System.out.println("After replacing: " + sb1);
        System.out.println();

        // Example 5: Deleting Characters
        sb1.delete(5, 12); // Deletes "Awesome"
        System.out.println("Example 5: Deleting Characters");
        System.out.println("After deleting: " + sb1);
        System.out.println();

        // Example 6: Reversing the StringBuffer
        sb1.reverse();
        System.out.println("Example 6: Reversing the StringBuffer");
        System.out.println("After reversing: " + sb1);
        System.out.println();

        // Example 7: Capacity and Length
        System.out.println("Example 7: Capacity and Length");
        System.out.println("Capacity: " + sb1.capacity());
        System.out.println("Length: " + sb1.length());
        System.out.println();

        // Example 8: Converting StringBuffer to String
        String str = sb1.toString();
        System.out.println("Example 8: Converting StringBuffer to String");
        System.out.println("Converted String: " + str);

        StringBuffer sb = new StringBuffer("Hello Java World");
        System.out.println(sb.indexOf("Java") != -1 ? "Does not contain Java" : "Contains Java");
    }
}
