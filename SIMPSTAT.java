import java.util.*;

class SIMPSTAT {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      int K = scan.nextInt();
      double meas[] = new double[N];

      for (int i = 0; i < N; i++) {
        meas[i] = scan.nextInt();
      }
      Arrays.sort(meas);
      for (int i = 0; i < K; i++) {
        meas[i] = 0;
        meas[N - 1 - i] = 0;
      }
      double total = 0;
      for (double i : meas) {
        total = total + i;
      }
      double avg = total / (N - K * 2);
      System.out.println(avg);

      T--;
    }
    scan.close();
  }
}
