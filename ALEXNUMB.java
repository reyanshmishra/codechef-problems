import java.util.*;

class ALEXNUMB {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      int ar[] = new int[N];

      for (int i = 0; i < ar.length; i++)
        ar[i] = scan.nextInt();

      Arrays.sort(ar);
      long count = 0;
      for (int i = 1; i < ar.length; i++) {
        if (ar[i] != ar[i - 1])
          count++;
      }
      System.out.println(count * (count + 1) / 2);

      T--;
    }
    scan.close();
  }

}
