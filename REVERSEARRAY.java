

import java.util.Arrays;

/**
 *
 * @author reyansh
 */
class REVERSEARRAY {
  public static void main(String[] args) {
    int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    reverTheArray(ar);
  }

  static void reverTheArray(int[] array) {

    for (int i = 0; i < array.length / 2; i++) {
      int lastPlace = array.length - i - 1;
      int start = array[i];
      int end = array[lastPlace];
      array[i] = end;
      array[lastPlace] = start;
      System.out.println(Arrays.toString(array));
    }
  }
}
