import java.util.Scanner;
import java.util.Stack;

class GIFTSRC {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      String S = scan.next();
      Stack<Character> chars = new Stack<>();
      chars.add('F');
      int x = 0;
      int y = 0;
      for (int i = 0; i < N; i++) {
        char c = S.charAt(i);
        if ((c == 'L' || c == 'R') && (chars.peek() != 'L' && chars.peek() != 'R')) {
          chars.add(c);
        }
        if ((c == 'U' || c == 'D') && (chars.peek() != 'D' && chars.peek() != 'U')) {
          chars.add(c);
        }
      }

      for (Character c : chars) {
        if (c == 'L')
          x -= 1;
        if (c == 'R')
          x += 1;
        if (c == 'U')
          y += 1;
        if (c == 'D')
          y -= 1;
      }
      System.out.println(x + " " + y);
      T--;
    }
    scan.close();
  }
}
