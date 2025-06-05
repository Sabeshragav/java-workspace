class test {
    int[] arr = new int[5];

    void setValue(int[] value) {
        int i = 0;
        for (int val : value) {
            arr[i] = val;
            i++;
        }
    }

    void getValue() {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}

public class array {
    public static void main(String[] args) {
        test obj = new test();
        int[] values = { 99, 98, 96, 95, 94 };
        obj.setValue(values);
        obj.getValue();
    }
}
