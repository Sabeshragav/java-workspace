
package algorithms.sorting;

class select {
    void fnsort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int pos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[pos]) {
                    pos = j;
                }
            }
            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "  ");
    }
}

public class selection {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 4, 1 };
        select ob = new select();
        ob.fnsort(arr);
    }
}
