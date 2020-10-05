
class RecursiveBinarySearch {
  public static void main(String[] args) {
    int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int count = 14;
    System.out.println(searchIt(count, arr, 0, arr.length - 1));
  }

  static int searchIt(int find, int arr[], int low, int high) {
    if (high < low)
      return -1;
    int mid = high + low / 2; // Or low+(high-low)/2; 5+10/2=7;
    if (find == arr[mid]) {
      return arr[mid];
    } else if (find > arr[mid]) {
      return searchIt(find, arr, mid + 1, high);
    } else if (find < arr[mid]) {
      return searchIt(find, arr, low, mid - 1);
    } else {
      return -1;
    }
  }
}
