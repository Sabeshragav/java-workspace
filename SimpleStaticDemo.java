
class StaticDemo {
    static int z = 100;

    StaticDemo() {
        z++;
    }

    static void display() {
        System.out.println("Value of z is " + z);
    }

    static {
        System.out.println("Inside staticDemo block");
    }
}

class SimpleStaticDemo {
    int i = 34; // instance variable
    static int z; // class variable
    static {

        System.out.println("inside static block: " + z);
    }

    SimpleStaticDemo() {
        z++;
        this.i++;
    }

    void test() {
        int k = 200; // local variable
        System.out.println("local variable: " + (k + i));
        System.out.println("value of z : " + z);

    }

    public static void main(String[] args) {
        SimpleStaticDemo acc = new SimpleStaticDemo();
        var obj = acc;
        System.out.println(acc.i);
        acc.i = 10;
        System.out.println(obj.i);
        obj.test();

    }
}
