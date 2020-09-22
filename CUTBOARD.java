import java.util.Scanner;

class CUTBOARD {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      int M = scan.nextInt();
      System.out.println((N - 1) * (M - 1));

      T--;
    }
    scan.close();
  }
}
