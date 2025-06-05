import java.util.*;

public class HashSetMethods {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();

        // 1. add(element): Adds an element to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Cherry");
        System.out.println("HashSet after add(): " + set);

        // // 2. addAll(collection): Adds all elements from another collection to the
        // set
        // HashSet<String> anotherSet = new HashSet<>();
        // anotherSet.add("Date");
        // anotherSet.add("Elderberry");
        // set.addAll(anotherSet);
        // System.out.println("HashSet after addAll(): " + set);

        // // 3. contains(element): Checks if the element is present in the set
        // System.out.println("Does HashSet contain 'Apple'? " + set.contains("Apple"));

        // // 4. remove(element): Removes a specific element from the set
        // set.remove("Banana");
        // System.out.println("HashSet after remove('Banana'): " + set);

        // // 5. size(): Returns the number of elements in the set
        // System.out.println("Size of HashSet: " + set.size());

        // // 6. isEmpty(): Checks if the set is empty
        // System.out.println("Is the HashSet empty? " + set.isEmpty());

        // // 7. iterator(): Returns an iterator over the elements in the set
        // System.out.print("Elements in HashSet using iterator: ");
        // for (String fruit : set) {
        // System.out.print(fruit + " ");
        // }
        // System.out.println();

        // // 8. clear(): Removes all elements from the set
        // set.clear();
        // System.out.println("HashSet after clear(): " + set);
        // System.out.println("Is the HashSet empty after clear()? " + set.isEmpty());

        // // 9. retainAll(collection): Keeps only the elements that are also in the
        // // specified collection
        // HashSet<String> set1 = new HashSet<>();
        // set1.add("Apple");
        // set1.add("Banana");
        // set1.add("Cherry");
        // set1.add("Date");

        // HashSet<String> set2 = new HashSet<>();
        // set2.add("Cherry");
        // set2.add("Date");
        // set2.add("Elderberry");

        // set1.retainAll(set2);
        // System.out.println("HashSet after retainAll(): " + set1);

        // // 10. toArray(): Converts the HashSet to an array
        // Object[] array = set1.toArray();
        // System.out.print("HashSet toArray(): ");
        // for (Object obj : array) {
        // System.out.print(obj + " ");
        // }
        // System.out.println();

        // // 11. removeAll(collection): Removes all elements in the specified
        // collection
        // // from the set
        // set1.removeAll(set2);
        // System.out.println("HashSet after removeAll(): " + set1);

        // // 12. equals(object): Checks if the set is equal to another set
        // HashSet<String> set3 = new HashSet<>(set2);
        // System.out.println("Does set2 equal set3? " + set2.equals(set3));
    }
}
