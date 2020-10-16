import java.util.Scanner;

class DECSTR {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      String s = "";
      char chars[] = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
          'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a'};
      for (int i = N; i >= 0; i--) {
        s = s + String.valueOf(chars[i % 26]);
      }
      System.out.println(s);
      T--;
    }
    scan.close();
  }
}
