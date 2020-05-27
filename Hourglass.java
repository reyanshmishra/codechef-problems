public class Hourglass {
  public static void main(String[] args) {
    int arr[][] = {{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 2, 4, 4, 0},
        {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}};
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = 0; j < arr.length - 2; j++) {
        int total = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) + (arr[i + 1][j + 1])
            + (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
        max = Math.max(total, max);
      }
    }
    System.out.println(max);

  }
}
