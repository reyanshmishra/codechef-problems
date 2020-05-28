import java.util.*;

class LEBOMBS {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      String s = "";
      while (s.length() != N) {
        s = scan.next();
      }
      int saved = 0;
      for (int i = 0; i < s.length(); i++) {
        boolean destroyed = false;
        if (s.charAt(i) == '1')
          destroyed = true;

        if (i > 0 && s.charAt(i - 1) == '1')
          destroyed = true;


        if (i < N - 1 && s.charAt(i + 1) == '1')
          destroyed = true;

        if (!destroyed) {
          saved++;
        }
      }
      System.out.println(saved);

      T--;
    }
    scan.close();
  }

}
