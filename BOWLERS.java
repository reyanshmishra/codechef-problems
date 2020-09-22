import java.util.Scanner;

class BOWLERS {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      int K = scan.nextInt();
      int L = scan.nextInt();
      if (K * L < N) {
        System.out.println(-1);
      } else if (K == 1 && N > 1) {
        System.out.println(-1);
      } else {
        int temp = 1;
        for (int i = 1; i <= N; i++) {
          if (temp > K) {
            temp = 1;
          }
          System.out.print(temp + " ");
          temp++;
        }
        System.out.println("");
      }

      T--;
    }
    scan.close();
  }

}
