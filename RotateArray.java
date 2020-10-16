import java.util.Scanner;


class RotateArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T-- > 0) {
      int N = scan.nextInt();
      int D = scan.nextInt();
      int arr[] = new int[N];
      for (int i = 0; i < N; i++) {
        if (i < D) {
          arr[N - D + i] = scan.nextInt();
        } else {
          arr[i - D] = scan.nextInt();
        }
      }
      for (int i : arr) {
        System.out.print(i + " ");
      }
      System.out.println("");
    }
    scan.close();
  }
}
