// class recursionClass {
//     int recursionHelper(int n) {
//         if (n < 1)
//             return 1;
//         else
//             return n * recursionHelper(n - 1);
//     }
// }

class recursion {

    static int recursionHelper(int n) {
        if (n < 1)
            return 1;
        else
            return n * recursionHelper(n - 1);
    }

    public static void main(String[] args) {
        // recursionClass obj = new recursionClass();

        System.out.println(recursionHelper(5));

        // System.out.println(obj.recursionHelper(5));
    }
}
