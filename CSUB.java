import java.util.*;


class CSUB {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();

    while (T > 0) {
      int N = scan.nextInt();
      String s = scan.next();
      long count = 0;
      for (int i = 0; i < N; i++) {
        if (s.charAt(i) == '1') {
          count++;
        }
      }
      System.out.println((count * (count + 1)) / 2);
      T--;
    }
    scan.close();
  }
}
