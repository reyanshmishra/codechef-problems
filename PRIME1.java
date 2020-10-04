import java.util.Scanner;

class PRIME1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int M = scan.nextInt();
      int N = scan.nextInt();
      for (int i = M; i <= N; i++) {
        if (isPrime(i) && i > 1)
          System.out.println(i);
      }
      T--;
    }
    scan.close();
  }

  static boolean isPrime(int number) {
    boolean flag = true;
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        flag = false;
        break;
      }
    }
    return flag;
  }
}
