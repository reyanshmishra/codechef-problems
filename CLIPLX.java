import java.util.Scanner;

class CLIPLX {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int X = scan.nextInt();
      int Y = scan.nextInt();
      if (X > Y) {
        System.out.println(X - Y);
      } else {
        System.out.println(0);

      }
      T--;
    }
    scan.close();
  }
}
