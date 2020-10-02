
import java.util.Scanner;

class ALTARAY {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int n = scan.nextInt();
      int arr[] = new int[n];
      int list[] = new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = scan.nextInt();
      }
      list[n - 1] = 1;
      for (int i = n - 2; i >= 0; i--) {
        long m = arr[i] * arr[i + 1];
        if (m < 0)
          list[i] = list[i + 1] + 1;
        else
          list[i] = 1;
      }

      /**
       * This code throws TLE but not the below one. String s = ""; for (int i : list) { s += i + "
       * "; } System.out.println(s);
       *
       *
       *
       */

      for (int i = 0; i < n; i++)
        System.out.print(list[i] + " ");
      System.out.println();
      T--;
    }
    scan.close();
  }

}
