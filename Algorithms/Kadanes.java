package Algorithms;

class Kadanes {
  public static void main(String args[]) {
    int a = 0, b = Integer.MIN_VALUE;
    int ar[] = {1, 2, -4, -3, 5, 8};

    for (int i : ar) {
      a = i + Math.max(a, 0);
      b = Math.max(a, b);
    }
    System.out.println(b);

  }
}
