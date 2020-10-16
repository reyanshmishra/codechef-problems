// Modular arithmetic
public class SumOfPair {
  public static void main(String[] args) {
    int sum = 13;
    int arr[] = new int[] {8, 9, 10, 11, 12};
    System.out.println(hasPair(arr, sum));
  }

  static boolean hasPair(int arr[], int sum) {
    int n = arr.length;
    int i = findPivot(arr, 0, n);

    int l = (i + 1) % n;
    int r = i;

    while (l != r) {
      int pairSum = arr[l] + arr[r];
      if (pairSum == sum)
        return true;
      if (pairSum < sum) {
        l = (l + 1) % n;
      } else {
        r = (n + r - 1) % n;
      }
    }
    return false;
  }



  static int findPivot(int arr[], int low, int high) {
    // base cases
    if (high < low)
      return -1;
    if (high == low)
      return low;

    /* low + (high - low)/2; */
    int mid = (low + high) / 2;
    if (mid < high && arr[mid] > arr[mid + 1])
      return mid;
    if (mid > low && arr[mid] < arr[mid - 1])
      return (mid - 1);
    if (arr[low] >= arr[mid])
      return findPivot(arr, low, mid - 1);
    return findPivot(arr, mid + 1, high);

  }
}
