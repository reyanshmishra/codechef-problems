import java.util.*;

class LUCKY5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      String no = scan.next();
      int count = 0;
      for (int i = 0; i < no.length(); i++) {
        if (no.charAt(i) != '4' && no.charAt(i) != '7') {
          count++;
        }
      }
      System.out.println(count);
      T--;
    }
    scan.close();
  }
}
