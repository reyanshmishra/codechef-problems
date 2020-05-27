import java.util.*;

class ELEVSTRS {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      double N = scan.nextDouble();
      double V1 = scan.nextDouble();
      double V2 = scan.nextDouble();
      double stairs = Math.sqrt(2) * N / V1;
      double elevator = N * 2 / V2;
      if (stairs > elevator) {
        System.out.println("Elevator");
      } else {
        System.out.println("Stairs");
      }
      T--;
    }
    scan.close();
  }
}
