import java.util.Scanner;

class GCD2 {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();

    while (T > 0) {
      long a = scan.nextInt();
      long b = scan.nextInt();
      while (true) {
        if (b == 0) {
          break;
        }
        long temp = b;
        b = a % b;
        a = temp;
      }
      System.out.println(a);

      T--;
    }
    scan.close();
  }
}
