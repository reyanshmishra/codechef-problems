import java.util.*;

class MAXDIFF {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      int K = scan.nextInt();
      int weights[] = new int[N];
      int total = 0;
      int rest = 0;
      for (int i = 0; i < N; i++) {
        weights[i] = scan.nextInt();
      }

      Arrays.sort(weights);

      for (int i = 0; i < K; i++) {
        rest += weights[i];
      }

      for (int i = K; i < N; i++) {
        total += weights[i];
      }
      System.out.println(total - rest);

      T--;
    }
    scan.close();
  }

}
