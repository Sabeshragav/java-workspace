class A {
    int x;

    A(int a) {
        x = a;
        System.out.println("Value of A is " + x);
    }
}

class B extends A {
    int y;

    B(int a, int b) {
        super(a);
        y = b;
        System.out.println("Value of B is " + y);
    }
}

class C extends B {
    int z;

    C(int a, int b, int c) {
        super(a, b);
        z = c;
        System.out.println("Value of C is " + z);
    }

    void fndisp() {
        System.out.println("Value of A,B,C are " + x + " " + y + " " + z);
    }
}

class parameterizedMultilevel {
    public static void main(String[] args) {
        C ob = new C(1, 2, 3);
        ob.fndisp();
    }
}