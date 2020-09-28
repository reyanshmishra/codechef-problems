import java.util.Scanner;

class CHCHCL {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int n = scan.nextInt();
      int m = scan.nextInt();
      System.out.println(n * m % 2 == 0 ? "Yes" : "No");
      T--;
    }
    scan.close();
  }
}
