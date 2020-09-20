import java.util.Scanner;

class FlatLand {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      int count = 0;
      do {
        int root = (int) Math.sqrt(N);
        N = N - (root * root);
        count++;
      } while (N != 0);
      System.out.println(count);
      T--;
    }
    scan.close();
  }
}
