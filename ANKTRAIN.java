import java.util.HashMap;
import java.util.Scanner;

class ANKTRAIN {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T-- > 0) {
      int N = scan.nextInt();
      HashMap<Integer, String> hash = new HashMap<>();
      if (N > 8) {
        N = (N % 8) + 1;
      }
      hash.put(1, "4LB");
      hash.put(2, "5MB");
      hash.put(3, "6UB");
      hash.put(4, "1LB");
      hash.put(5, "2MB");
      hash.put(6, "3UB");
      hash.put(7, "8SU");
      hash.put(8, "7SL");
      System.out.println(hash.get(N));

    }
    scan.close();
  }
}
