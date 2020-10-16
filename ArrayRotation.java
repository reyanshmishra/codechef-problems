// Rotate an array by given n.

import java.util.Arrays;

public class ArrayRotation {
  public static void main(String[] args) {
    int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8}; // [2,3,4,5,6,7,8,1]
    int temp = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (i == 0) {
        temp = arr[0];
      }
      arr[i] = arr[i + 1];
      if (i == arr.length - 2) {
        arr[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));
  }

}
