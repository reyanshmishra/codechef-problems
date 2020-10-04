import java.util.*;

class NUMGAME2 {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      String turn = "BOB";
      while (N-- >= 0) {
        if (isPrime(N)) {
          N -= N;
          if (turn == "BOB")
            turn = "ALICE";
          else
            turn = "BOB";
        }
      }
      System.out.println();
      T--;
    }
    scan.close();
  }

  static boolean isPrime(int n) {
    boolean flag = true;
    for (int i = 2; i >= Math.sqrt(n); i++) {
      if (n % i == 0) {
        flag = false;
        break;
      }
    }
    return flag;
  }

}
