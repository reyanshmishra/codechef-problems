import java.util.*;


class DIVIDING {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int stamps[] = new int[N];
    int total = 0, sum = 0;

    for (int i = 0; i < stamps.length; i++) {
      int d = scan.nextInt();
      total += d;
      sum += i + 1;
    }
    System.out.println(total == sum ? "YES" : "NO");

    scan.close();
  }
}
