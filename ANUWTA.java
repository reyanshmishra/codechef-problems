import java.util.*;

class ANUWTA {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      long N = scan.nextInt();
      System.out.println(N + N * (N + 1) / 2);

      T--;
    }
    scan.close();
  }

}
