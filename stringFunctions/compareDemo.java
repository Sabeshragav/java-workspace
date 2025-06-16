
class compareDemo {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "apple";
        String s3 = "Apple";

        // Using compareTo
        /*
         * 0 = > Both strings are equal
         * < 0 = > str1 comes before str2 lexicographically
         * > 0 = > str1 comes after str2 lexicographically
         */
        System.out.println(s1.compareTo(s2)); // Negative (uppercase < lowercase)
        System.out.println(s1.compareTo(s3)); // 0 (same strings)

        // Using equals
        System.out.println(s1.equals(s2)); // false (case matters)
        System.out.println(s1.equals(s3)); // true

    }
}
