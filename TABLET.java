
import java.util.*;

class TABLET {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {

      int N = scan.nextInt();
      int B = scan.nextInt();
      int area = 0;
      for (int i = 0; i < N; i++) {
        int W = scan.nextInt();
        int H = scan.nextInt();
        int P = scan.nextInt();
        int curArea = W * H;
        if (B >= P && curArea > area) {
          area = W * H;
        }
      }

      System.out.println(area == 0 ? "no tablet" : area);

      T--;
    }
    scan.close();
  }

}
