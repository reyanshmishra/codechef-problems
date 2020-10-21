public class FloodFill {



  public static void main(String args[]) {
    int arr[][] = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
    int x = 0;
    int y = 0;
    fillIt(arr, x, y, 2, arr[x][y]);
  }

  static void fillIt(int[][] arr, int x, int y, int newColor, int currColor) {
    if (x < 0 || y < 0 || x > arr.length - 1 || y > arr[0].length - 1 || arr[x][y] == newColor
        || arr[x][y] != currColor)
      return;

    arr[x][y] = newColor;

    fillIt(arr, x - 1, y, newColor, currColor);
    fillIt(arr, x + 1, y, newColor, currColor);
    fillIt(arr, x, y - 1, newColor, currColor);
    fillIt(arr, x, y + 1, newColor, currColor);
  }
}
