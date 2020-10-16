import java.util.Scanner;

class SearchElementInSortedRotatedArray {

  public static void main(String[] args) {
    int arr[] = new int[] {8, 9, 1, 2, 3, 4, 5, 6, 7};
    int d = 4;
    int pivote = findPivot(arr, 0, arr.length);
    if (arr[pivote] == d)
      System.out.println(pivote);
    else if (arr[0] <= d)
      System.out.println(binarySearch(arr, d, 0, pivote - 1));
    else
      System.out.println(binarySearch(arr, d, pivote + 1, arr.length - 1));
  }

  static int binarySearch(int arr[], int key, int low, int high) {

    if (high < low)
      return -1;

    int mid = low + (high - low) / 2;
    if (arr[mid] == key)
      return mid;
    if (arr[mid] > key) {
      return binarySearch(arr, key, low, mid - 1);
    }
    return binarySearch(arr, key, mid + 1, high);
  }

  static int findPivot(int[] arr, int low, int high) {

    if (high < low)
      return -1;
    if (high == low)
      return low;

    int mid = low + (high - low) / 2;

    if (mid < high && arr[mid] > arr[mid + 1])
      return mid;
    if (mid > low && arr[mid] < arr[mid - 1])
      return mid - 1;
    if (arr[low] >= arr[mid])
      return findPivot(arr, low, mid - 1);
    return findPivot(arr, mid + 1, high);
  }

}
