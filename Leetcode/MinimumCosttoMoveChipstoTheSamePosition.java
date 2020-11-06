package Leetcode;

public class MinimumCosttoMoveChipstoTheSamePosition {
  public static void main(String args[]) {
    int coins[] = new int[] {12, 10};
    int evens = 0;
    int odds = 0;

    for (int i : coins) {
      if (i % 2 == 0)
        evens++;
      else
        odds++;
    }
    System.out.println(Math.min(odds, evens));
  }
}
