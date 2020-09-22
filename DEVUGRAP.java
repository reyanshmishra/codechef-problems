import java.util.*;

class DEVUGRAP {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int noBaskets = scan.nextInt();
      int K = scan.nextInt();

      int baskets[] = new int[noBaskets];
      for (int i = 0; i < noBaskets; i++) {
        baskets[i] = scan.nextInt();
      }
      int ans = 0;
      for (int i : baskets) {
        int rem = i % K;
        if (i > K) {
          ans = ans + Math.min(rem, K - rem);
        } else {
          ans = ans + K - rem;
        }
      }
      System.out.println(ans);
      T--;
    }
    scan.close();
  }

}
