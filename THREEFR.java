import java.util.Scanner;

class THREEFR {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int x = scan.nextInt();
      int y = scan.nextInt();
      int z = scan.nextInt();

      if (x + y + z == 0)
        System.out.println("yes");
      else if (x > y && x > z && y + z - x == 0)
        System.out.println("yes");
      else if (y > z && y > x && x + z - y == 0)
        System.out.println("yes");
      else if (z > x && z > y && x + y - z == 0)
        System.out.println("yes");
      else
        System.out.println("no");


      T--;
    }
    scan.close();
  }
}
