import java.util.Arrays;

class bitRepresentation {
    public static void main(String[] args) {
        int a = 7;
        char[] arr = new char[32];
        Arrays.fill(arr, '0');
        int pos = 31;

        while (a > 0) {
            arr[pos] = (char) ('0' + (a % 2));
            // System.out.println((char) a % 2);
            a /= 2;
            pos--;

        }

        System.out.println(new String(arr));
    }
}
