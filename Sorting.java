import java.util.Arrays;

public class Sorting {
  public static void main(String args[]) {
    int arr[] = {2};
    int n = arr.length;
    // bubbleSort(arr, n);
    selectionSort(arr, n);
    System.out.println(Arrays.toString(arr));
  }

  // Big(O)=(N*N);
  static void bubbleSort(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  // Find the smallest number in the array and swap it with the i;
  static void selectionSort(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      int iMin = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[iMin])
          iMin = j;
      }
      int temp = arr[i];
      arr[i] = arr[iMin];
      arr[iMin] = temp;
    }
  }
}
