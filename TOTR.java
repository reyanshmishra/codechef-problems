import java.util.*;

class TOTR {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    String M = scan.next();
    String s[] = new String[T];

    for (int i = 0; i < T; i++) {
      s[i] = scan.next();
    }

    for (String string : s) {
      String x = "";
      for (int i = 0; i < string.length(); i++) {
        int d = string.charAt(i);
        if (d == '_') {
          x += " ";
        } else if (d == '.') {
          x += ".";
        } else if (d == '?') {
          x += "?";
        } else if (d == ',') {
          x += ",";
        } else if (d == '!') {
          x += "!";
        } else {
          if (Character.isUpperCase(d)) {
            x += Character.toUpperCase(M.charAt(Character.toLowerCase(d) - 'a'));
          } else {
            x += M.charAt(Character.toLowerCase(d) - 'a');
          }
        }
      }
      System.out.println(x);
    }
    scan.close();
  }

}
