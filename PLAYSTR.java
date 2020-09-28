import java.util.Scanner;

class PLAYSTR {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int n = scan.nextInt();
      String s = scan.next();
      String r = scan.next();
      int cr1 = 0, cs1 = 0, cr0 = 0, cs0 = 0;

      for (int i = 0; i < n; i++) {
        char chr = r.charAt(i);
        char chs = s.charAt(i);
        if (chr == '1')
          cr1++;
        if (chr == '0')
          cr0++;

        if (chs == '1')
          cs1++;
        if (chs == '0')
          cs0++;
      }

      if (cr1 == cs1 && cr0 == cs0)
        System.out.println("YES");
      else
        System.out.println("NO");

      T--;
    }
    scan.close();
  }
}
