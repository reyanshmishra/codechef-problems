import java.util.Scanner;

class TICKETS5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      String s = scan.next();
      char first = '0';
      char sec = '0';

      if (s.length() >= 2 && s.charAt(0) != s.charAt(1)) {
        first = s.charAt(0);
        sec = s.charAt(1);
        boolean goodDay = true;
        boolean alt = true;
        for (int i = 0; i < s.length(); i++) {
          if (alt && s.charAt(i) == first) {
            alt = false;
          } else if (!alt && s.charAt(i) == sec) {
            alt = true;
          } else {
            goodDay = false;
            break;
          }
        }
        System.out.println(goodDay ? "YES" : "NO");
      } else {
        System.out.println("NO");
      }

      T--;
    }
    scan.close();
  }
}
