import java.util.Scanner;

public class SumOffArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      int arr[] = new int[N];
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
        sum += scan.nextInt();
      }
      System.out.println(sum);

      T--;
    }
    scan.close();
  }
}
