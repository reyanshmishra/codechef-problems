package Algorithms;

import java.util.ArrayList;

public class CycleInDirectedGraph {
  public static void main(String args[]) {
    int[][] ar = new int[][] {{0, 1}, {1, 2}};
    int visited[] = new int[3];
    ArrayList<Integer> graph[] = new ArrayList[3];
    for (int i = 0; i < 3; i++) {
      graph[i] = new ArrayList<>();
    }
    for (int node[] : ar) {
      graph[node[0]].add(node[1]);
    }
    for (int i = 0; i < graph.length; i++) {
      if (visited[i] == 0) {
        if (dfs(graph, visited, i)) {
          System.out.println("FIC");
        }
      }
    }

  }

  static boolean dfs(ArrayList<Integer> graph[], int[] visited, int node) {
    if (visited[node] == 2)
      return true;
    visited[node] = 2;
    for (int i = 0; i < graph[node].size(); i++) {
      if (visited[graph[node].get(i)] != 1) {
        if (dfs(graph, visited, node)) {
          return true;
        }
      }
    }
    return false;
  }
}
