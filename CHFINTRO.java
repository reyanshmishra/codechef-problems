import java.util.Scanner;

class CHFINTRO {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String T = scan.nextLine();
    String[] a = T.split(" ");
    int d = Integer.parseInt(a[0]);
    while (d-- > 0) {
      int rating = Integer.parseInt(scan.nextLine());
      if (rating >= Integer.parseInt(a[1])) {
        System.out.println("Good boi");
      } else {
        System.out.println("Bad boi");
      }
    }
    scan.close();
  }
}
