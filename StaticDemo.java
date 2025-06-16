class StaticDemo {

    // Static variable
    static int staticCount = 0;

    // Instance variable
    int instanceCount = 0;

    // Static block (executed only once when the class is loaded)
    static {
        System.out.println("Static block executed.");
    }

    // Constructor
    public StaticDemo() {
        staticCount++;
        instanceCount++;
        System.out.println("Constructor called.");
        System.out.println("Static Count: " + staticCount);
        System.out.println("Instance Count: " + instanceCount);
    }

    // Static method
    static void showStaticMessage() {
        System.out.println("Inside static method.");
        // Can't access instanceCount here
    }

    // Instance method
    void showInstanceMessage() {
        System.out.println("Inside instance method.");
        System.out.println("Static Count (from instance method): " + staticCount);
        System.out.println("Instance Count: " + instanceCount);
    }

    // Main method (also static)
    public static void main(String[] args) {
        System.out.println("Main method started.");

        StaticDemo.showStaticMessage(); // Calling static method without object

        StaticDemo obj1 = new StaticDemo();
        obj1.showInstanceMessage();

        StaticDemo obj2 = new StaticDemo();
        obj2.showInstanceMessage();

        System.out.println("Static Count accessed directly: " + StaticDemo.staticCount);
    }
}
