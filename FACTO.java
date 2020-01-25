/**
 * FACTO
 */
public class FACTO {

  public static void main(String[] args) {
    System.out.println(facto(4));
  }

  private static int facto(int n) {
    System.out.println("===" + n);

    if (n < 0) {
      return -1;
    } else if (n == 1) {
      return 1;
    } else {
      return n * facto(n - 1);
    }
  }
}
