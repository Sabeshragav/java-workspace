class check{
    public static void main(String[] args) {
        int a = 1;
        if (a & 1)
            a <<= 1;
        System.out.printf("%d", a);
    }
}