
public class check {

    public static void main(String[] args) {
        int a = 6, b = 9;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}