import java.util.*;

class OJUMPS {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner scan = new Scanner(System.in);
    long P = scan.nextLong();
    if (P % 6 == 0 || P % 6 == 1 || P % 6 == 3)
      System.out.println("yes");
    else
      System.out.println("no");

    scan.close();
  }

}
