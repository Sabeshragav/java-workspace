
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2, 3, 4, 2 };
        int left = 0, right = arr.length - 1;
        int target = 3;
        System.out.println(RecursiveBinarySearch(arr, left, right, target));
        System.out.println(IterativeBinarySearch(arr, left, right, target));
        System.out.println(RotatedBinarySeach(arr, left, right, target));

    }

    private static int RotatedBinarySeach(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            // To Handle duplicates: we can't decide the sorted half
            // if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
            // left++;
            // right--;
            // }

            if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target <= arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (arr[mid] <= target && target <= arr[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }

        }
        return -1;
    }

    private static int IterativeBinarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] > target)
                right = mid - 1;

            else
                left = mid + 1;
        }
        return -1;
    }

    private static int RecursiveBinarySearch(int[] arr, int left, int right, int target) {
        if (left > right)
            return -1;

        int mid = (left + right) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            return RecursiveBinarySearch(arr, mid + 1, right, target);
        else
            return RecursiveBinarySearch(arr, left, mid - 1, target);
    }
}
