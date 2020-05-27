
class MatrixSearch {
  public static void main(String[] args) {
    int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
    int x = 37;
    int i = 0, j = matrix.length - 1, n = matrix.length;
    while (i < n && j >= 0) {
      int el = matrix[i][j];
      if (el == x) {
        System.out.println(i + " : " + j + " = " + el);
        break;
      }
      if (el > x) {
        j--;
      } else {
        i++;
      }
    }
  }
}
