public class LeftRotateArray {
  static void printArry(int arr[], int n, int k) {
    int mod = k % n;
    for (int i = k; i < n; i++) {
      System.out.println(arr[(i + mod) % n] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int k = 2;
    printArry(arr, arr.length, k);
  }
}
