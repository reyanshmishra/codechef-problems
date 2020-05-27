import java.util.*;

class SPCANDY {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      long N = scan.nextLong();
      long K = scan.nextLong();
      if (N == 0) {
        System.out.println(0 + " " + 0);
      } else if (K == 0) {
        System.out.println(0 + " " + N);
      } else {
        System.out.println(N / K + " " + N % K);
      }


      T--;
    }
    scan.close();
  }

}
