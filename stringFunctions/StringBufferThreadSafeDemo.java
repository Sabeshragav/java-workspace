package stringFunctions;

class StringBufferThreadSafeDemo {
    static StringBuffer buffer = new StringBuffer();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                buffer.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                buffer.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("StringBuffer length: " + buffer.length()); // Expected: 2000
    }
}
