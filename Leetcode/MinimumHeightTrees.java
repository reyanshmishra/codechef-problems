package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class MinimumHeightTrees {
  public static void main(String args[]) {
    int ar[][] = {{1, 0}};
    int n = 2;
    ArrayList<Set<Integer>> adj = new ArrayList<>(n);

    for (int i = 0; i < n; i++)
      adj.add(new HashSet<>());

    for (int edge[] : ar) {
      adj.get(edge[0]).add(edge[1]);
      adj.get(edge[1]).add(edge[0]);
    }
    ArrayList<Integer> leaves = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      if (adj.get(i).size() == 1)
        leaves.add(i);
    }

    while (n > 2) {
      n -= leaves.size();
      ArrayList<Integer> newLeaves = new ArrayList<>();
      for (Integer leaf : leaves) {
        Integer neighor = adj.get(leaf).iterator().next();
        adj.get(neighor).remove(leaf);
        if (adj.get(neighor).size() == 1)
          newLeaves.add(neighor);
      }
      leaves = newLeaves;
    }
    System.out.println(leaves);
  }
}
