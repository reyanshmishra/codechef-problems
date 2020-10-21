class SubmissionDetail {
  public static void main(String[] args) {
    int arr[] = {1, 2, 2, 3, 4};
    int maj = arr[0];
    int n = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == maj) {
        n++;
      } else {
        n--;
        if (n == 0) {
          maj = arr[i];
          n = 1;
        }
      }
    }
    System.out.println(maj);
  }
}
