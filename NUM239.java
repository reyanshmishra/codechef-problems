import java.util.*;

class NUM239 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N1 = scan.nextInt();
      int N2 = scan.nextInt();
      int count = 0;
      for (int i = N1; i <= N2; i++) {
        int d = i % 10;
        if (d == 2 || d == 3 || d == 9) {
          count++;
        }
      }
      System.out.println(count);


      T--;
    }
    scan.close();
  }

}
