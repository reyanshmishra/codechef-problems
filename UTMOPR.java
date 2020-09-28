import java.util.*;

class UTMOPR {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int n = scan.nextInt();
      int k = scan.nextInt();
      int S = 0;

      for (int i = 0; i < n; i++) {
        S += scan.nextInt();
      }

      if (k == 1) {
        System.out.println(S % 2 != 0 ? "even" : "odd");
      } else {
        System.out.println("even");
      }
      T--;
    }
    scan.close();
  }
}
