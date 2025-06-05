import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // 1. put(key, value): Adds a key-value pair to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        System.out.println("HashMap after put(): " + map);

        // 2. get(key): Retrieves the value associated with the key
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // 3. remove(key): Removes the key-value pair for the specified key
        map.remove("Banana");
        System.out.println("HashMap after remove('Banana'): " + map);

        // 4. containsKey(key): Checks if a key is present in the map
        System.out.println("Does map contain key 'Cherry'? " + map.containsKey("Cherry"));

        // 5. containsValue(value): Checks if a value is present in the map
        System.out.println("Does map contain value 2? " + map.containsValue(2));

        // 6. size(): Returns the number of key-value pairs in the map
        System.out.println("Size of HashMap: " + map.size());

        // 7. isEmpty(): Checks if the map is empty
        System.out.println("Is the map empty? " + map.isEmpty());

        // 8. putAll(map): Adds all entries from another map to this map
        HashMap<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Date", 4);
        anotherMap.put("Elderberry", 5);
        map.putAll(anotherMap);
        System.out.println("HashMap after putAll(): " + map);

        // 9. putIfAbsent(key, value): Adds the key-value pair only if the key is not
        // already present
        map.putIfAbsent("Apple", 10); // Does nothing since "Apple" already exists
        map.putIfAbsent("Fig", 6);
        System.out.println("HashMap after putIfAbsent(): " + map);

        // 10. replace(key, value): Replaces the value for the specified key
        map.replace("Cherry", 33);
        System.out.println("HashMap after replace('Cherry', 33): " + map);

        // 11. keySet(): Returns a Set view of the keys contained in this map
        System.out.println("Keys in map: " + map.keySet());

        // 12. values(): Returns a Collection view of the values contained in this map
        System.out.println("Values in map: " + map.values());

        // 13. entrySet(): Returns a Set view of the key-value pairs in the map
        System.out.println("Entries in map: " + map.entrySet());

        // 14. clear(): Removes all the mappings from this map
        map.clear();
        System.out.println("HashMap after clear(): " + map);
        System.out.println("Is the map empty after clear()? " + map.isEmpty());
    }
}
