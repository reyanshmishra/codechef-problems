import java.util.Scanner;

class PCJ18B {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int n = scan.nextInt();
      int sum = 0;
      for (int i = n; i > 0; i = i - 2)
        sum += i * i;
      System.out.println(sum);

      T--;
    }
    scan.close();
  }
}
