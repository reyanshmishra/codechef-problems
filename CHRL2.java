import java.util.Scanner;

class CHRL2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int c = 0, h = 0, e = 0, f = 0;

    for (int i = 0; i < s.length(); i++) {
      char letter = s.charAt(i);
      if (letter == 'C')
        c++;
      else if (letter == 'H' && c > h)
        h++;
      else if (letter == 'E' && h > e)
        e++;
      else if (letter == 'F' && e > f)
        f++;
    }
    System.out.println(f);
    scan.close();
  }

  public static String charRemoveAt(String str, int p) {
    return str.substring(0, p) + str.substring(p + 1);
  }
}
