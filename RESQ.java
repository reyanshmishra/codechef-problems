import java.util.*;

class RESQ {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int cakes = scan.nextInt();
      int i = 1;
      int diff = Integer.MAX_VALUE;
      while (i <= Math.sqrt(cakes)) {
        if (cakes % i == 0) {
          int d = cakes / i;
          if (d - i >= 0 && d - i < diff) {
            diff = d - i;
          }
        }
        i++;
      }
      System.out.println(diff);

      T--;
    }
    scan.close();
  }

}
