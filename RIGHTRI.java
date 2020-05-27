import java.util.*;

class RIGHTRI {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    int count = 0;
    while (T > 0) {
      int x1 = scan.nextInt();
      int y1 = scan.nextInt();

      int x2 = scan.nextInt();
      int y2 = scan.nextInt();

      int x3 = scan.nextInt();
      int y3 = scan.nextInt();

      double d1 = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));

      double d2 = ((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2));
      double d3 = ((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1));

      if (d1 > d2 && d1 > d3) {
        if (d1 == d2 + d3) {
          count++;
        }
      } else if (d2 > d1 && d2 > d3) {
        if (d2 == d1 + d3) {
          count++;
        }
      } else if (d3 > d2 && d3 > d1) {
        if (d3 == d1 + d2) {
          count++;
        }
      }

      T--;
    }
    System.out.println(count);

    scan.close();

  }
}
