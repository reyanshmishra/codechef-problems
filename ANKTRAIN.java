import java.util.Scanner;

class ANKTRAIN {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T-- > 0) {
      int N = scan.nextInt();
      int rem = N % 8;
      switch (rem) {
        case 0:
          System.out.println(N - 1 + "SL");
          break;
        case 1:
          System.out.println(N + 3 + "LB");
          break;
        case 2:
          System.out.println(N + 3 + "MB");
          break;
        case 3:
          System.out.println(N + 3 + "UB");
          break;
        case 4:
          System.out.println(N - 3 + "LB");
          break;
        case 5:
          System.out.println(N - 3 + "MB");
          break;
        case 6:
          System.out.println(N - 3 + "UB");
          break;
        case 7:
          System.out.println(N + 1 + "SU");
          break;
        default:
          break;
      }



    }
    scan.close();
  }
}
