import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LOSTMAX {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = Integer.parseInt(scan.nextLine());
    while (T-- > 0) {
      String s = "";
      s = scan.nextLine();
      String no[] = s.trim().split(" ");
      ArrayList<Integer> numbers = new ArrayList<>();
      for (String number : no) {
        numbers.add(Integer.parseInt(number));
      }

      numbers.remove(numbers.indexOf(no.length - 1));
      Collections.sort(numbers);

      System.out.println(numbers.get(numbers.size() - 1));
    }
    scan.close();
  }
}
