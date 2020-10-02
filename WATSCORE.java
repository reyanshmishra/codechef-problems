import java.util.HashMap;
import java.util.Scanner;

class WATSCORE {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();

    while (T > 0) {
      HashMap<Integer, Integer> map = new HashMap<>();
      int N = scan.nextInt();
      for (int i = 0; i < N; i++) {
        int p = scan.nextInt();
        int s = scan.nextInt();
        if (p >= 1 && p <= 8) {
          if (!map.isEmpty() && map.get(p) != null && map.get(p) < s) {
            map.put(p, s);
          } else if (map.get(p) == null) {
            map.put(p, s);
          }
        }
      }

      int ans = 0;
      for (Integer value : map.values()) {
        ans += value;
      }

      System.out.println(ans);

      T--;
    }
    scan.close();
  }

}
