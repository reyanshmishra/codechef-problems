public class MaxSumOfArray {
  public static void main(String ar[]) {
    int A[] = {1, -2, 3, -2};
    int max = A[0];
    for (int i = 0; i < A.length; i++) {
      if (A[i] > max)
        max = A[i];
      int sum = A[i];
      for (int j = i + 1; j < A.length; j++) {
        sum += A[j];
        if (sum > max)
          max = sum;
      }
    }
    System.out.println(max);
  }
}
