import java.util.Scanner;

class MARCHA1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      int M = scan.nextInt();
      int arr[] = new int[N];
      for (int i = 0; i < N; i++) {
        arr[i] = scan.nextInt();
      }

      boolean flag = false;
      for (int i = 0; i < N; i++) {
        int sum = 0;
        sum += arr[i];
        if (flag)
          break;
        for (int j = i + 1; j < N; j++) {
          sum += arr[j];
          if (sum == M) {
            flag = true;
            break;
          }
        }
      }

      System.out.println(flag ? "Yes" : "No");

      T--;
    }
    scan.close();
  }
}
