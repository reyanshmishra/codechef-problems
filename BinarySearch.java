import java.util.*;

class BinarySearch {
    public static void main(String[] args) {
        int find = 9;
        int arr[] = new int[] {1, 1, 2, 3, 3, 4, 4, 4, 4, 5, 5, 6, 7, 8, 9, 9, 9, 10};
        int low = binarySearch(arr, find, true);
        int high = binarySearch(arr, find, false);
        System.out.println((high - low) + 1);

    }

    static int binarySearch(int[] arr, int find, boolean lower) {
        int n = arr.length;
        int low = 0, high = n - 1 / 2, result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (find == arr[mid]) {
                result = mid;
                if (lower) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] > find) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return result;
    }
}
