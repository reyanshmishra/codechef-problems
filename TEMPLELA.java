import java.util.Scanner;

class TEMPLELA {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int n = scan.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = scan.nextInt();
      }

      boolean flag = true;

      for (int j = 0; j < (n + 1) / 2; j++) {
        if (arr[j] != j + 1 || arr[n - 1 - j] != j + 1) {
          flag = false;
          break;
        }
      }
      System.out.println(flag ? "yes" : "no");

      T--;
    }
    scan.close();
  }
}
