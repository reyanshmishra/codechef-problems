import java.util.Scanner;

class TTENIS {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T-- > 0) {
      String s = scan.next();
      int first = 0;
      int sec = 0;
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '0')
          sec++;
        else
          first++;

        if (Math.max(first, sec) >= 11 && Math.abs(first - sec) >= 2)
          break;
      }
      System.out.println(first > sec ? "WIN" : "LOSE");
    }
    scan.close();
  }

}
