import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        String[] arrs = { "hello", "bye" };
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arrs));

        // 2. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After adding elements: " + list);

        // 3. Inserting an element at a specific index
        list.add(0, "Mango");
        System.out.println("After inserting at index 1: " + list);

        // 4. Accessing an element by index
        String fruit = list.get(2);
        System.out.println("Element at index 2: " + fruit);

        // 5. Modifying/Replacing an element at a specific index
        list.set(2, "Grapes");
        System.out.println("After modifying index 2: " + list);

        // 6. Removing an element by index
        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        // 7. Removing an element by value
        list.remove("Cherry");
        System.out.println("After removing 'Cherry': " + list);

        // 8. Checking if the list contains an element
        boolean containsApple = list.contains("Apple");
        System.out.println("Contains 'Apple': " + containsApple);

        // 9. Getting the size of the ArrayList
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // 10. Iterating through the ArrayList
        System.out.print("Iterating through the list: ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        // 11. Clearing the ArrayList
        list.clear();
        System.out.println("After clearing the list: " + list);

        // 12. Checking if the ArrayList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty: " + isEmpty);

        // 13. Sorting the ArrayList
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // 14. Reversing the ArrayList
        Collections.reverse(list); // reverses the original
        System.out.println("Reversed list: " + list);
        // just display the reverse and doesn't modify the original
        System.out.println("Reversed list: " + list.reversed());

        // 15. Cloning the ArrayList
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);
    }
}
