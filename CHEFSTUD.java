import java.util.Scanner;

class CHEFSTUD {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    String[] strs = new String[T];
    for (int i = 0; i < T; i++) {
      strs[i] = scan.next();
    }

    for (String string : strs) {
      int N = 0;
      for (int i = 0; i < string.length() - 1; i++) {
        if (string.charAt(i) == '<' && string.charAt(i + 1) == '>') {
          N++;
        }
      }
      System.out.println(N);

    }

    scan.close();
  }

}
