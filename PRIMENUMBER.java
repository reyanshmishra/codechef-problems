
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author reyansh
 */
class PRIMENUMBER {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    System.out.println(isPrime(number));

    scan.close();
  }

  static boolean isPrime(int number) {
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
