import java.util.Scanner;

public class RotationSum {
  public static void main(String[] args) {
    int arr[] = new int[] {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int n = arr.length;
    int total = 0;
    for (int i = 0; i < n; i++) {
      int subTotal = 0;
      for (int j = 0; j < n; j++) {
        subTotal += j * arr[j];
      }
      if (subTotal > total) {
        total = subTotal;
      }
    }
    System.out.println(total);
  }
}
