import java.util.Scanner;

class TTENIS {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      String s = scan.next();
      int first = 0;
      int sec = 0;
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '0') {
          sec++;
        } else {
          first++;
        }
        if (first == 11) {
          System.out.println("WON");
          break;
        } else if (sec == 11) {
          System.out.println("LOSE");
          break;
        }
      }
      T--;
    }
    scan.close();
  }

}
