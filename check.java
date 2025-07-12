
public class check {

    public static void main(String[] args) {
        int n = 1; // 1010
        int mask = 1; // 0001
        n = n ^ mask; // Toggles the last bit
        System.out.println(n);
    }

}