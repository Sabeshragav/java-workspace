import java.util.*;

public class TreeSetMethods {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 1. add(E e): Adds an element to the set
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(15);

        System.out.println("TreeSet after add(): " + treeSet);

        // 2. addAll(Collection<? extends E> c): Adds all elements from a collection
        TreeSet<Integer> anotherSet = new TreeSet<>();
        anotherSet.add(25);
        anotherSet.add(30);
        treeSet.addAll(anotherSet);

        System.out.println("TreeSet after addAll(): " + treeSet);

        // 3. contains(Object o): Checks if an element is in the set
        System.out.println("TreeSet contains 10: " + treeSet.contains(10));

        // 4. remove(Object o): Removes a specific element
        treeSet.remove(5);
        System.out.println("TreeSet after remove(5): " + treeSet);

        // 5. first(): Returns the first (lowest) element
        System.out.println("First element: " + treeSet.first());

        // 6. last(): Returns the last (highest) element
        System.out.println("Last element: " + treeSet.last());

        // 7. pollFirst(): Retrieves and removes the first element
        System.out.println("Removed first element using pollFirst(): " + treeSet.pollFirst());
        System.out.println("TreeSet after pollFirst(): " + treeSet);

        // 8. pollLast(): Retrieves and removes the last element
        System.out.println("Removed last element using pollLast(): " + treeSet.pollLast());
        System.out.println("TreeSet after pollLast(): " + treeSet);

        // 9. size(): Returns the number of elements in the set
        System.out.println("Size of TreeSet: " + treeSet.size());

        // 10. isEmpty(): Checks if the set is empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // 11. clear(): Removes all elements from the set
        treeSet.clear();
        System.out.println("TreeSet after clear(): " + treeSet);

        // Adding some elements again for further operations
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(25);

        // 12. headSet(E toElement): Returns a view of elements less than toElement
        System.out.println("HeadSet (less than 15): " + treeSet.headSet(15));

        // 13. tailSet(E fromElement): Returns a view of elements greater than or equal
        // to fromElement
        System.out.println("TailSet (greater than or equal to 15): " + treeSet.tailSet(15));

        // 14. subSet(E fromElement, E toElement): Returns a view of elements between
        // fromElement (inclusive) and toElement (exclusive)
        System.out.println("SubSet (between 10 and 25): " + treeSet.subSet(10, 25));

        // 15. iterator(): Returns an iterator over the elements
        System.out.print("Elements using iterator: ");
        for (Integer element : treeSet) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 16. descendingSet(): Returns a reverse order view of the elements
        System.out.println("Descending Set: " + treeSet.descendingSet());

        // 17. ceiling(E e): Returns the least element greater than or equal to the
        // given element
        System.out.println("Ceiling of 18: " + treeSet.ceiling(18));

        // 18. floor(E e): Returns the greatest element less than or equal to the given
        // element
        System.out.println("Floor of 18: " + treeSet.floor(18));

        // 19. higher(E e): Returns the least element strictly greater than the given
        // element
        System.out.println("Higher than 15: " + treeSet.higher(15));

        // 20. lower(E e): Returns the greatest element strictly less than the given
        // element
        System.out.println("Lower than 15: " + treeSet.lower(15));
    }
}
