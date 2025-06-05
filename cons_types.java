
// constructor types

class A {
    String str;

    // default
    A() {
        this.str = "Python";
    }

    // parameterized
    A(String s) {
        this.str = s;
    }

    // copy
    A(A object) {
        this.str = object.str;
    }

    void disp() {
        System.out.println("Hello " + this.str);
    }

}

class cons_types {
    public static void main(String[] as) throws Exception {
        // default cons
        A obj = new A();
        obj.disp();
        System.out.println("obj.str = " + obj.str);

        // parameterized cons
        A obj1 = new A("JAVA");
        obj1.disp();
        System.out.println("obj1.str = " + obj1.str);

        // copy cons
        A obj2 = new A(obj1);
        obj2.disp();

    }
}
