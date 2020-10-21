
import java.util.Scanner;

class PRGIFT {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T-- > 0) {
      int n = scan.nextInt();
      int arr[] = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = scan.nextInt();
      }
      int count = 0;
      for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
          count++;
        }
      }
    }
    scan.close();
  }

}
