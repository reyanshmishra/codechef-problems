public class Rotation {

  static int countRotations(int arr[], int n) {
    // We basically find index of minimum
    // element
    int min = arr[0], min_index = -1;
    for (int i = 0; i < n; i++) {
      if (min > arr[i]) {
        min = arr[i];
        min_index = i;
      }
    }
    return min_index;
  }

  // Driver program to test above functions
  public static void main(String[] args) {
    int arr[] = {2, 3, 6, 12};
    int n = arr.length;

    System.out.println(countRotations(arr, n));
  }

}
