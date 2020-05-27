import java.util.*;

class RRCOPY {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      HashMap<Integer, Integer> map = new HashMap<>();
      int N = scan.nextInt();

      for (int i = 0; i < N; i++) {
        int v = scan.nextInt();
        if (!map.containsKey(v)) {
          map.put(v, 1);
        }
      }
      System.out.println(map.size());
      T--;
    }
    scan.close();
  }

}
