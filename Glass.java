class Glass {
  public static void main(String[] args) {
    int dd = 8;
    for (int i = 0; i < dd; i++) {
      for (int j = 0; j < i; j++)
        System.out.print(" ");

      for (int j = i; j < dd; j++)
        System.out.print(j + " ");
      System.out.println();
    }

    for (int i = 0; i < dd; i++) {

      for (int j = i; j < dd; j++)
        System.out.print("-");

      for (int j = 0; j < i; j++)
        System.out.print(j + " ");

      System.out.println();
    }

  }
}
