package Algorithms;

import java.util.ArrayList;

public class PossibleBipartitionSolution {
  public static void main(String[] args) {
    int arr[][] = new int[][] {{1, 2}, {2, 4}, {1, 4}};
    int N = 4;
    ArrayList<Integer>[] list = new ArrayList[N + 1];
    int color[] = new int[N + 1];

    for (int i = 0; i <= N; i++)
      list[i] = new ArrayList<>();

    for (int i[] : arr) {
      list[i[0]].add(i[1]);
      list[i[1]].add(i[0]);
    }

    for (int i = 1; i <= N; i++) {
      if (color[i] == 0 && !dfs(i, 1, color, list)) {
        System.out.println("NO");
      }
    }
    System.out.println("YES");
  }

  static boolean dfs(int node, int c, int[] color, ArrayList<Integer>[] list) {
    if (color[node] != 0)
      return color[node] == c;
    color[node] = c;

    for (int neighour : list[node]) {
      if (!dfs(neighour, -c, color, list)) {
        return false;
      }
    }
    return true;
  }
}
