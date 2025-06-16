package stringFunctions;

class StringBuilderNotThreadSafeDemo {
    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                builder.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                builder.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("StringBuilder length: " + builder.length()); // Might be < 2000
    }
}
