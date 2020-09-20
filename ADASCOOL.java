import java.util.*;

class ADASCOOL {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      int M = scan.nextInt();
      if (N % 2 == 0 || M % 2 == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

      T--;
    }
    scan.close();
  }
}
