import java.util.Scanner;

class JDELAY {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int n = scan.nextInt();
      int count = 0;
      for (int i = 0; i < n; i++) {
        int s = scan.nextInt();
        int j = scan.nextInt();
        if (j - s > 5)
          count++;
      }
      System.out.println(count);
      T--;
    }
    scan.close();
  }
}
