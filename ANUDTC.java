import java.util.*;

class ANUDTC {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int cake = 360;
      int p = scan.nextInt();

      String f = cake % p == 0 ? "y " : "n ";
      String s = cake >= p ? "y " : "n ";
      String t = cake >= p * (p + 1) / 2 ? "y " : "n ";

      System.out.print(f);
      System.out.print(s);
      System.out.println(t);


      T--;
    }
    scan.close();
  }
}
