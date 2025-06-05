import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        // Create a dictionary using HashMap
        HashMap<String, String> dictionary = new HashMap<>();

        // Add key-value pairs (word, meaning)
        dictionary.put("apple", "a fruit that grows on trees");
        dictionary.put("book", "a set of written or printed pages bound together");
        dictionary.put("car", "a vehicle with four wheels used for transportation");

        // Access a word's meaning
        String meaning = dictionary.get("apple");
        System.out.println("The meaning of 'apple' is: " + meaning);

        // Check if a word exists in the dictionary
        if (dictionary.containsKey("car")) {
            System.out.println("The dictionary contains the word 'car'.");
        }

        // Remove a word from the dictionary
        dictionary.remove("book");

        // Iterate over the dictionary
        System.out.println("All dictionary entries:");
        for (String key : dictionary.keySet()) {
            System.out.println(key + ": " + dictionary.get(key));
        }
    }
}
