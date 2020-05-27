import java.util.*;

class SALARY {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      int noOfWorkers = scan.nextInt();
      int total = 0;
      int lowest = Integer.MAX_VALUE;

      for (int i = 0; i < noOfWorkers; i++) {
        int salary = scan.nextInt();
        total += salary;
        if (salary < lowest) {
          lowest = salary;
        }
      }

      System.out.println(total - noOfWorkers * lowest);
      T--;
    }
    scan.close();
  }
}
