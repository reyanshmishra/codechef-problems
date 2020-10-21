import java.util.Scanner;

class TRP {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();

    int arr[] = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = scan.nextInt();
    }

    int C = scan.nextInt();
    boolean flag = false;
    for (int i = 0; i < N; i++) {
      if (C + arr[C] < N - 1)
        C = i;

      if (arr[C] == 0) {
        flag = true;
        break;
      }
      if (C - arr[C] >= 0)
        C = i;

      if (arr[C] == 0) {
        flag = true;
        break;
      }
    }
    System.out.println(flag);
    scan.close();
  }
}
