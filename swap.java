
public class swap {
    public static void main(String[] args) {

        int x = 4, y = 3;
        System.out.println("Before: x=" + x + ", y=" + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        // or

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After: x=" + x + ", y=" + y);
    }
}
