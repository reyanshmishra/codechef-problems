import java.util.*;

class DEVUGRAP {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      long N = scan.nextInt();
      long K = scan.nextInt();
      long total = 0;
      for (int i = 0; i < N; i++) {
        int m = scan.nextInt();
        System.out.println(m / K);
        long r = m % K;
        if (m >= K)
          total += Math.min(r, K - r);
        else
          total += K - r;
      }
      System.out.println(total);
      T--;
    }
    scan.close();
  }

}
