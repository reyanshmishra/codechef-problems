import java.util.Scanner;

class PLAYPIAN {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      String s = scan.next();
      String splitted[] = s.split("(?<=\\G..)");
      boolean flag = false;

      for (String string : splitted) {
        if (string.length() == 2 && string.charAt(0) == string.charAt(1)) {
          System.out.println("no");
          flag = true;
          break;
        }
      }

      if (!flag)
        System.out.println("yes");
      T--;
    }
    scan.close();
  }
}
