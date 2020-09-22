import java.util.Scanner;

class CO92JUDG {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();

      int aMax = 0, bMax = 0, aTotal = 0, bTotal = 0;
      for (int i = 0; i < N; i++) {
        int time = scan.nextInt();
        if (time > aMax) {
          aMax = time;
        }
        aTotal = aTotal + time;
      }
      aTotal = aTotal - aMax;
      for (int i = 0; i < N; i++) {
        int time = scan.nextInt();
        if (time > bMax) {
          bMax = time;
        }
        bTotal = bTotal + time;
      }
      bTotal = bTotal - bMax;
      if (aTotal < bTotal)
        System.out.println("Alice");
      else if (aTotal > bTotal)
        System.out.println("Bob");
      else
        System.out.println("Draw");

      T--;
    }
    scan.close();
  }
}
