import java.util.Scanner;

class QUADROOT {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double c = scan.nextDouble();

    double d = (b * b) - (4 * a * c);
    double x = (-b + Math.sqrt(d)) / 2 * a;
    double x1 = (-b - Math.sqrt(d)) / 2 * a;
    System.out.println(x);
    System.out.println(x1);
    scan.close();
  }
}
