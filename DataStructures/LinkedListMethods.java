import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        // 1. Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 2. Adding elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        // System.out.println("After adding elements: " + list);

        // 3. Adding element at a specific index
        list.add(1, "Mango");
        // System.out.println("After adding 'Mango' at index 1: " + list);

        // 4. Adding elements to the front (addFirst) and end (addLast) of the
        // LinkedList
        list.addFirst("Pineapple");
        list.addLast("Orange");
        System.out.println("After addFirst and addLast: " + list);
        String str = list.pollFirst();
        System.out.println(str);
        System.out.println(list);

        // 5. Accessing elements
        String firstElement = list.getFirst(); // Accessing the first element
        String lastElement = list.getLast(); // Accessing the last element
        String elementAtIndex2 = list.get(2); // Accessing element at a specific index
        System.out.println("First element: " + firstElement);
        System.out.println("Element at index 2: " + elementAtIndex2);
        System.out.println("Last element: " + lastElement);

        // 6. Modifying elements
        list.set(2, "Grapes");
        System.out.println("After modifying element at index 2: " + list);

        // 7. Removing elements
        list.remove(1); // Removing element at index 1
        list.removeFirst(); // Removing the first element
        list.removeLast(); // Removing the last element
        System.out.println("After removing elements: " + list);

        // 8. Checking if the list contains an element
        boolean containsApple = list.contains("Apple");
        System.out.println("List contains 'Apple': " + containsApple);

        // 9. Getting the size of the LinkedList
        int size = list.size();
        System.out.println("Size of the LinkedList: " + size);

        // 10. Iterating through the LinkedList
        System.out.print("Iterating through the LinkedList: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 11. Clearing the LinkedList
        list.clear();
        System.out.println("After clearing the LinkedList: " + list);

        // 12. Checking if the LinkedList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the LinkedList empty: " + isEmpty);
    }
}
