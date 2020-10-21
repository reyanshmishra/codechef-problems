public class Collinear {
  public static void main(String args[]) {
    int[][] points = {{0, 0}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
    System.out.println(isLine(points));
  }

  static boolean isLine(int[][] points) {
    if (points.length <= 1)
      return true;

    boolean flag = true;
    float slope = getSlope(points[0], points[1]);
    for (int i = 2; i < points.length; i++) {
      float slope2 = getSlope(points[0], points[i]);
      if (slope != slope2) {
        return false;
      }
    }

    return flag;
  }

  static float getSlope(int point1[], int point2[]) {
    float x = point1[0];
    float y = point1[1];

    float x1 = point2[0];
    float y1 = point2[1];

    if (x1 == x)
      return Integer.MAX_VALUE;

    float slop2 = (float) (y1 - y) / (float) (x1 - x);
    return slop2;
  }
}
