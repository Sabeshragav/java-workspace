public class getSet {
    int i = 34; // instance variable
    static int z; // class variable
    static {
        z = 10;
        System.out.println("inside static block: " + z);
    }

    void test() {
        int k = 200; // local variable
        System.out.println("local variable: " + (k + i));
    }

    public static void main(String[] args) {
        getSet acc = new getSet();
        var obj = acc;
        System.out.println(acc);
    }
}
