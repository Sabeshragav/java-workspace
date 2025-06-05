public class SingleNumber {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 1, 2, 1, 2 };
        int res = 0;
        for (int num : numbers) {
            res = res ^ num;
        }
        System.out.println(res);
    }
}
