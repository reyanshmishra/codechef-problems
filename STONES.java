import java.util.*;


class STONES {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      String J = scan.next();
      String S = scan.next();
      int counts = 0;
      for (int i = 0; i < S.length(); i++) {
        for (int k = 0; k < J.length(); k++) {
          if (S.charAt(i) == J.charAt(k)) {
            counts++;
            break;
          }
        }

      }
      System.out.println(counts);
      T--;
    }
    scan.close();
  }

}
