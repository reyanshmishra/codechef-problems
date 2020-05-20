import java.util.*;


class ERROR {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      String s = scan.next();
      if (s.indexOf("010") != -1 || s.indexOf("101") != -1) {
        System.out.println("Good");
      } else {
        System.out.println("Bad");

      }


      T--;
    }
    scan.close();
  }

}
