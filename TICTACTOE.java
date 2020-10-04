import java.util.Scanner;

class TICTACTOE {
  public static void main(String[] args) {
    String[] grid = new String[] {"x", "o", "x", "x", "o", "x", "x", "o", "x"};
    int solutions[][] =
        {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 4, 8}, {2, 4, 6}, {0, 3, 6}, {2, 5, 8}, {1, 4, 7}};
    for (int i = 0; i < solutions.length; i++) {
      int a[] = solutions[i];
      if (grid[0] == grid[1] && grid[1] == grid[2]) {
        System.out.println("WON");
        break;
      }
    }

  }
}
