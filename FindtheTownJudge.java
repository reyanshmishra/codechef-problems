
public class FindtheTownJudge {
  public static void main(String[] args) {
    int trust[][] = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
    int N = 4;
    System.out.println(findIt(trust, N));
  }

  static int findIt(int[][] trust, int N) {

    int person[] = new int[N + 1];
    int judges[] = new int[N + 1];

    for (int i = 0; i < trust.length; i++) {
      int a = trust[i][0];
      int b = trust[i][1];
      person[a] = 1;
      judges[b]++;
    }

    for (int i = 1; i < person.length; i++) {
      if (judges[i] == N - 1 && person[i] == 0) {
        return i;
      }
    }
    return -1;
  }
}
