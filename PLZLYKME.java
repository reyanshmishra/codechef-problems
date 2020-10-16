import java.util.Scanner;

class PLZLYKME {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int L = scan.nextInt();
      int D = scan.nextInt();
      int S = scan.nextInt();
      int C = scan.nextInt();
      int toLive = 0;
      if (D <= 1) {
        toLive = S;
      } else {
        while (D - 1 > 0) {
          toLive = toLive + (toLive * C);
          D--;
        }
      }
      if (toLive >= L) {
        System.out.println("ALIVE AND KICKING");
      } else {
        System.out.println("DEAD AND ROTTING");
      }

      T--;
    }
    scan.close();
  }
}
