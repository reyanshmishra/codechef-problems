import java.util.Scanner;

class MATCHES {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {

      int a = scan.nextInt();
      int b = scan.nextInt();
      String total = String.valueOf(a + b);

      int requiredMatches = 0;
      for (int i = 0; i < total.length(); i++) {
        if (total.charAt(i) == '0')
          requiredMatches += 6;
        if (total.charAt(i) == '1')
          requiredMatches += 2;
        if (total.charAt(i) == '2')
          requiredMatches += 5;
        if (total.charAt(i) == '3')
          requiredMatches += 5;
        if (total.charAt(i) == '4')
          requiredMatches += 4;
        if (total.charAt(i) == '5')
          requiredMatches += 5;
        if (total.charAt(i) == '6')
          requiredMatches += 6;
        if (total.charAt(i) == '7')
          requiredMatches += 3;
        if (total.charAt(i) == '8')
          requiredMatches += 7;
        if (total.charAt(i) == '9')
          requiredMatches += 6;
      }
      System.out.println(requiredMatches);
      T--;
    }
    scan.close();
  }

}
