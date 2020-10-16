import java.util.Scanner;

class NAME2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T > 0) {
      char M[] = scan.next().toCharArray();
      char W[] = scan.next().toCharArray();

      System.out.println(M.length > W.length ? canMarry(M, W) : canMarry(W, M));
      T--;
    }
    scan.close();
  }

  static String canMarry(char a[], char b[]) {
    int i = 0, j = 0;
    while (i < a.length && j <= b.length) {
      if (b[j] == a[i]) {
        j++;
        i++;
        if (j == b.length)
          break;
      } else {
        i++;
      }
    }
    return j == b.length ? "YES" : "NO";
  }
}
