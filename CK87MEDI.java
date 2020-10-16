import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class CK87MEDI {
  public static void main(String[] args) throws IOException {
    Scanner br = new Scanner(System.in);
    int T = br.nextInt();
    while (T-- > 0) {
      int n = br.nextInt();
      int k = br.nextInt();
      int numbers[] = new int[n];

      for (int i = 0; i < n; i++) {
        numbers[i] = br.nextInt();
      }
      Arrays.sort(numbers);
      int index = (n + k) / 2;

      System.out.println(numbers[index]);
    }
    br.close();
  }

}
