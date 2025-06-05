class Fibonacci {
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci sol = new Fibonacci();
        System.out.println(sol.fibonacci(2));
    }
}