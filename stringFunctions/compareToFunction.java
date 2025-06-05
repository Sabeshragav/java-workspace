package stringFunctions;

class compareToFunction {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        /*
         * 0 = > Both strings are equal
         * < 0 = > str1 comes before str2 lexicographically
         * > 0 = > str1 comes after str2 lexicographically
         */

        System.out.println(str1.compareTo(str2)); // Lexicographical (dictionary order) comparision
    }
}
