import java.util.HashMap;

class OnesCompliment {
  public static void main(String[] args) {
    for (String string : args) {

    }
    System.out.println(String.valueOf(findComplement(5)));
  }

  public static int findComplement(int num) {
    int n = 0;
    while (n < num) {
      n = (n << 1) | 1;
    }
    return n - num;
  }
}
