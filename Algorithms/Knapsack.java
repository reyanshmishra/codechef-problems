package Algorithms;

import java.util.Arrays;

public class Knapsack {


  static int[][] mem = new int[4][5];

  public static void main(String args[]) {
    // [Weight,Profit]

    int items[][] = {{2, 2}, {2, 4}, {1, 23}};
    for (int arr[] : mem) {
      Arrays.fill(arr, -1);
    }
    int n = 3;
    System.out.println(maxProfit(items, 0, n));
    System.out.println(0);
  }

  static int maxProfit(int[][] items, int i, int w) {
    if (items.length == i || w == 0)
      return 0;

    int weight = items[i][0];
    int profit = items[i][1];
    if (weight <= w) {
      int profit1 = profit + maxProfit(items, i + 1, w - weight);
      int profit2 = maxProfit(items, i + 1, w);
      int v = Math.max(profit1, profit2);
      return v;
    } else {
      int v = maxProfit(items, i + 1, w);
      return v;
    }
  }
}
