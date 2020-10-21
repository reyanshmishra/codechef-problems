import java.util.Scanner;

class PCYCLE {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int N = scan.nextInt();
      int arr[] = new int[N + 1];

      for (int i = 1; i <= arr.length; i++) {
        arr[i] = scan.nextInt();
      }


      T--;
    }
    scan.close();
  }
}
