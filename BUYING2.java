import java.util.*;

class BUYING2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      int X = scan.nextInt();
      int notes[] = new int[N];
      int total = 0;

      for (int i = 0; i < N; i++) {
        notes[i] = scan.nextInt();
        total += notes[i];
      }

      int res = 0;
      for (int i = 0; i < notes.length; i++) {
        if (notes[i] <= total % X) {
          res = -1;
          break;
        }
      }
      System.out.println(res != -1 ? total / X : res);

      T--;
    }
    scan.close();
  }

}
