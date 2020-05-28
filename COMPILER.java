import java.util.*;

class COMPILER {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      Stack<String> stack = new Stack<>();
      String s = scan.next();
      int count = 0;
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '<') {
          stack.push(s.charAt(i) + "");
        } else {
          if (stack.isEmpty()) {
            break;
          } else {
            stack.pop();
            if (stack.empty())
              count = i + 1;
          }
        }
      }

      System.out.println(count);

      T--;
    }
    scan.close();
  }

}
