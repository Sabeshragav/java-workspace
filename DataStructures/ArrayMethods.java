
import java.util.Arrays;
import java.util.List;

public class ArrayMethods {
        public static void main(String[] args) {
                // 1. Arrays.toString(array): Converts array to string
                int[] arr1 = { 1, 2, 3 };
                String str = Arrays.toString(arr1);
                System.out.println("Array as String: " + str.charAt(2));

                // 2. Arrays.sort(array):Sort array in ascending order (Dual-Pivot Quicksort)
                int[] arr2 = { 3, 1, 2 };
                Arrays.sort(arr2);
                // for (int res : arr2) {
                // System.out.println(res);
                // }
                System.out.println(Arrays.toString(arr2));

                // 3. Arrays.binarySearch(array, key): Searches for an element in a sorted array
                int[] sortedArray = { 1, 2, 3, 4, 5 };
                int index = Arrays.binarySearch(sortedArray, 3);
                System.out.println("Index of element 3: " + index);

                // 4. Arrays.copyOf(array, newLength): Copies the array into a new array with
                // specified length
                int[] arr3 = { 1, 2, 3 };
                int[] copiedArray = Arrays.copyOf(arr3, 5);
                System.out.println("Copied Array (with new length): " +
                                Arrays.toString(copiedArray));

                // 5. Arrays.fill(array, value): Fills the array with the specified value
                int[] filledArray = new int[5];
                Arrays.fill(filledArray, 7);
                System.out.println("Array filled with 7: " + Arrays.toString(filledArray));

                // 6. Arrays.equals(array1, array2): Compares two arrays for equality
                int[] arr4 = { 1, 2, 3 };
                int[] arr5 = arr4;
                arr4[0] = 4;
                System.out.println("Arrays are equal: " + Arrays.equals(arr4, arr5));
                System.out.println(arr4[0]);
                System.out.println(arr5[0]);

                // 7. Arrays.asList(array): Converts array to a fixed-size List
                String[] strArray = { "a", "b", "c" };
                List<String> list = Arrays.asList(strArray);
                System.out.println("Array as List: " + list);

                // 8. Arrays.deepToString(array): Converts a multidimensional array to string
                int[][] multiArray = { { 1, 2 }, { 3, 4 } };
                System.out.println("Multidimensional Array as String: " +
                                Arrays.deepToString(multiArray));

                // 9. Arrays.parallelSort(array): Sorts the array using parallel sorting
                int[] unsortedArray = { 5, 2, 9, 1 };
                Arrays.parallelSort(unsortedArray);
                System.out.println("Parallel Sorted Array: " +
                                Arrays.toString(unsortedArray));

                // 10. Arrays.stream(array): Converts array to Stream for additional operations
                int[] streamArray = { 1, 2, 3 };
                int sum = Arrays.stream(streamArray).sum();
                System.out.println("Sum of array elements: " + sum);

                // 11. Minimum in an array

                int min = Arrays.stream(streamArray).min().orElseThrow(() -> new RuntimeException("Array is Empty"));
                System.out.println("Minimum of array elements: " + min);

                // Two arrays to concatenate
                int[] array1 = { 1, 2, 3 };
                int[] array2 = { 4, 5, 6 };

                // New array to hold the concatenated result
                int[] result = new int[array1.length + array2.length];

                // Copy elements of array1 to result
                System.arraycopy(array1, 0, result, 0, array1.length);

                // Copy elements of array2 to result
                System.arraycopy(array2, 0, result, array1.length, array2.length);

                // Output the result
                System.out.println("Concatenated Array: " + Arrays.toString(result));

                String[] array = { "apple", "banana", "cherry" };
                String res = String.join(", ", array);
                System.out.println("Joined Array: " + res);

        }
}
