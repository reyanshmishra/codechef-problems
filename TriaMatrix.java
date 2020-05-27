
class TriaMatrix {
  public static void main(String[] args) {
    int m[][] =
        {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        if (j <= i) {
          System.out.print(m[i][j]);
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }


  }
}
