import java.util.*;

class AMSGAME1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      int ar[] = new int[N];
      for (int i = 0; i < N; i++) {
        ar[i] = scan.nextInt();
      }
      int i = 1;
      int res = ar[0];
      while (i < N) {
        res = gcd(res, ar[i]);
        i++;
      }

      System.out.println(res);

      T--;
    }
    scan.close();
  }

  static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }

}
