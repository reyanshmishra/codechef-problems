import java.util.Scanner;

class ZCOSCH {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    if (T >= 1 && T <= 50)
      System.out.println(100);
    else if (T >= 51 && T <= 100)
      System.out.println(50);
    else
      System.out.println(0);


    scan.close();
  }
}
