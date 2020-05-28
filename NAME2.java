import java.util.Scanner;

class NAME2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      String M = scan.next();
      String W = scan.next();
      String big = "", small = "", res = "";
      if (M.length() > W.length()) {
        big = M;
        small = W;
      } else {
        big = W;
        small = M;
      }
      int j = 0, i = 0;

      while (i < big.length() && j < small.length()) {
        if (big.charAt(i) == small.charAt(j)) {
          res += small.charAt(j);
          i++;
          j++;
          if (res.length() == small.length())
            break;
        } else {
          i++;
        }
      }
      if (res.length() == small.length()) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }



      T--;
    }
    scan.close();
  }
}
