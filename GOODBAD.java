import java.util.*;

class GOODBAD {
  public static void main(String[] args) {
    {
      Scanner sc = new Scanner(System.in);
      int tc = sc.nextInt();
      while (tc > 0) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int c = 0, b = 0;
        for (int i = 0; i < n; i++) {
          if ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122)
            c++;
          else
            b++;
        }

        if (n - b <= k && n - c <= k)
          System.out.println("both");
        else if (n - c >= k)
          System.out.println("brother");
        else if (n - b >= k)
          System.out.println("chef");
        else
          System.out.println("none");

        tc--;
      }
      sc.close();
    }
  }
}
