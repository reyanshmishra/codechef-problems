import java.util.*;

class TACHSTCK {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int D = scan.nextInt();
    int sticks[] = new int[N];

    for (int i = 0; i < N; i++) {
      sticks[i] = scan.nextInt();
    }
    Arrays.sort(sticks);
    int pairs = 0;
    for (int i = 0; i < sticks.length - 1; i++) {
      if (sticks[i + 1] - sticks[i] <= D) {
        pairs++;
        i++;
      }
    }
    System.out.println(pairs);


    scan.close();
  }

}
