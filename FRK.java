import java.util.Scanner;

class FRK {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int friends = 0;
    while (N > 0) {
      String u = scan.next();
      if (u.indexOf("ch") > -1 || u.indexOf("he") > -1 || u.indexOf("ef") > -1) {
        friends++;
      }
      N--;
    }
    System.out.println(friends);
    scan.close();
  }
}
