
class PrivateDemo1 {
    protected PrivateDemo1() {
        boolean x = true;
        System.out.println("Hello java from constructor" + x);
    }// private constructor

    private void msg1() {
        System.out.println("Hello java from msg()");
    }

    void msg() {
        // System.out.println("Hello java from msg()");
        msg1();
    }

    // public static void main(String args[]) {
    // PrivateDemo obj = new PrivateDemo();
    // }
}

public class PrivateDemo {

    public static void main(String[] args) {
        PrivateDemo1 obj = new PrivateDemo1();
        obj.msg();
    }
}
