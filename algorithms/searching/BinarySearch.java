
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.print(Search(arr, 0, arr.length - 1, 0));
    }

    private static int Search(int[] arr, int left, int right, int target) {
        if (left > right)
            return -1;

        int mid = (left + right) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            return Search(arr, mid + 1, right, target);
        else
            return Search(arr, left, mid - 1, target);
    }
}
