import java.util.TreeMap;
import java.util.Map;
import java.util.NavigableMap;

public class TreeMapMethods {
    public static void main(String[] args) {
        // 1. Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // 2. put(K key, V value): Adds key-value pairs to the map
        treeMap.put(1, "Apple");
        treeMap.put(3, "Banana");
        treeMap.put(2, "Cherry");
        treeMap.put(5, "Date");
        treeMap.put(4, "Elderberry");

        System.out.println("TreeMap after put(): " + treeMap);

        // 3. get(Object key): Retrieves the value for a given key
        System.out.println("Value for key 2: " + treeMap.get(2));

        // 4. containsKey(Object key): Checks if a specific key is present
        System.out.println("TreeMap contains key 3: " + treeMap.containsKey(3));

        // 5. containsValue(Object value): Checks if a specific value is present
        System.out.println("TreeMap contains value 'Banana': " + treeMap.containsValue("Banana"));

        // 6. remove(Object key): Removes the entry for the specified key
        treeMap.remove(5);
        System.out.println("TreeMap after remove(5): " + treeMap);

        // 7. size(): Returns the number of key-value pairs
        System.out.println("Size of TreeMap: " + treeMap.size());

        // 8. isEmpty(): Checks if the map is empty
        System.out.println("Is TreeMap empty? " + treeMap.isEmpty());

        // 9. clear(): Removes all mappings from the map
        treeMap.clear();
        System.out.println("TreeMap after clear(): " + treeMap);

        // Adding elements again for further operations
        treeMap.put(1, "Apple");
        treeMap.put(3, "Banana");
        treeMap.put(2, "Cherry");
        treeMap.put(5, "Date");
        treeMap.put(4, "Elderberry");

        // 10. firstKey(): Returns the first (lowest) key
        System.out.println("First key: " + treeMap.firstKey());

        // 11. lastKey(): Returns the last (highest) key
        System.out.println("Last key: " + treeMap.lastKey());

        // 12. firstEntry(): Returns the entry for the first (lowest) key
        System.out.println("First entry: " + treeMap.firstEntry());

        // 13. lastEntry(): Returns the entry for the last (highest) key
        System.out.println("Last entry: " + treeMap.lastEntry());

        // 14. pollFirstEntry(): Retrieves and removes the first entry
        System.out.println("Removed first entry using pollFirstEntry(): " + treeMap.pollFirstEntry());
        System.out.println("TreeMap after pollFirstEntry(): " + treeMap);

        // 15. pollLastEntry(): Retrieves and removes the last entry
        System.out.println("Removed last entry using pollLastEntry(): " + treeMap.pollLastEntry());
        System.out.println("TreeMap after pollLastEntry(): " + treeMap);

        // 16. higherKey(K key): Returns the least key strictly greater than the given
        // key
        System.out.println("Key higher than 2: " + treeMap.higherKey(2));

        // 17. lowerKey(K key): Returns the greatest key strictly less than the given
        // key
        System.out.println("Key lower than 2: " + treeMap.lowerKey(2));

        // 18. ceilingKey(K key): Returns the least key greater than or equal to the
        // given key
        System.out.println("Ceiling key of 2: " + treeMap.ceilingKey(2));

        // 19. floorKey(K key): Returns the greatest key less than or equal to the given
        // key
        System.out.println("Floor key of 2: " + treeMap.floorKey(2));

        // 20. subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive):
        // Returns a view of the portion of this map
        NavigableMap<Integer, String> subMap = treeMap.subMap(2, true, 4, true);
        System.out.println("SubMap (from 2 to 4 inclusive): " + subMap);

        // 21. headMap(K toKey, boolean inclusive): Returns a view of the portion of
        // this map whose keys are less than (or equal to) toKey
        NavigableMap<Integer, String> headMap = treeMap.headMap(3, true);
        System.out.println("HeadMap (up to 3 inclusive): " + headMap);

        // 22. tailMap(K fromKey, boolean inclusive): Returns a view of the portion of
        // this map whose keys are greater than (or equal to) fromKey
        NavigableMap<Integer, String> tailMap = treeMap.tailMap(3, true);
        System.out.println("TailMap (from 3 inclusive): " + tailMap);

        // 23. descendingMap(): Returns a reverse order view of the mappings
        System.out.println("Descending Map: " + treeMap.descendingMap());

        // 24. keySet(): Returns a Set view of the keys
        System.out.println("Key Set: " + treeMap.keySet());

        // 25. values(): Returns a Collection view of the values
        System.out.println("Values Collection: " + treeMap.values());

        // 26. entrySet(): Returns a Set view of the mappings
        System.out.println("Entry Set: " + treeMap.entrySet());

        // 27. replace(K key, V value): Replaces the entry for the specified key only if
        // it is currently mapped to some value
        treeMap.replace(1, "Apricot");
        System.out.println("TreeMap after replace(1, 'Apricot'): " + treeMap);

        // 28. replace(K key, V oldValue, V newValue): Replaces the entry for the
        // specified key only if currently mapped to the specified value
        treeMap.replace(3, "Banana", "Blackberry");
        System.out.println("TreeMap after replace(3, 'Banana', 'Blackberry'): " + treeMap);

        // 29. putIfAbsent(K key, V value): Puts the specified key-value pair only if
        // the key is not already present
        treeMap.putIfAbsent(4, "Elderberry");
        System.out.println("TreeMap after putIfAbsent(4, 'Elderberry'): " + treeMap);

        // 30. computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction):
        // Computes a value if the specified key is absent
        treeMap.computeIfAbsent(6, k -> "Fig");
        System.out.println("TreeMap after computeIfAbsent(6, 'Fig'): " + treeMap);

        // 31. computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V>
        // remappingFunction): Computes a new value if the specified key is present
        treeMap.computeIfPresent(6, (k, v) -> v + " Fruit");
        System.out.println("TreeMap after computeIfPresent(6, 'Fig Fruit'): " + treeMap);

        // 32. compute(K key, BiFunction<? super K, ? super V, ? extends V>
        // remappingFunction): Computes a new value for the specified key
        treeMap.compute(2, (k, v) -> v + " Tree");
        System.out.println("TreeMap after compute(2, 'Cherry Tree'): " + treeMap);
    }
}
