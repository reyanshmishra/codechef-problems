
import java.util.Scanner;

class PRGIFT {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T-- > 0) {
      int n = scan.nextInt();
      int k = scan.nextInt();
      int arr[] = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = scan.nextInt();
      }
      int count = 0;
      boolean found = false;
      for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
          count++;
          if (count == k) {
            found = true;
            break;
          }
        }
      }
      System.out.println(found ? "YES" : "NO");


    }
    scan.close();
  }

}
