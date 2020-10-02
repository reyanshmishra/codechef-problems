import java.util.Scanner;

class CHEFARRP {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int n = scan.nextInt();
      int arr[] = new int[n];
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
        arr[i] = scan.nextInt();
      }

      for (int i = 0; i < arr.length; i++) {
        long m = 1;
        long a = 0;

        for (int j = i; j < arr.length; j++) {
          m *= arr[j];
          a += arr[j];
          if (a == m)
            count++;
        }
      }
      System.out.println(count);
      T--;
    }
    scan.close();
  }
}
