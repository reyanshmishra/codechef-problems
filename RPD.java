import java.util.Scanner;

class RPD {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = Integer.parseInt(scan.nextLine());
    while (T-- > 0) {
      int n = scan.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = scan.nextInt();
      }
      int ans = 0;
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          int product = arr[i] * arr[j];
          int sum = sumOfDigits(product);
          ans = Math.max(ans, sum);
        }
      }
      System.out.println(ans);
    }
    scan.close();
  }

  static int sumOfDigits(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}
