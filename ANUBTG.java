import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class ANUBTG {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T-- > 0) {
      int N = scan.nextInt();
      Integer costs[] = new Integer[N];
      for (int i = 0; i < costs.length; i++) {
        costs[i] = scan.nextInt();
      }
      Arrays.sort(costs, Collections.reverseOrder());

      int totalCost = 0;
      for (int i = 0; i < N; i++) {
        if (i % 4 < 2) {
          totalCost += costs[i];
        }
      }
      System.out.println(totalCost);
    }
    scan.close();
  }
}
