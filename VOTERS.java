import java.util.*;

class VOTERS {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n1 = scan.nextInt();
    int n2 = scan.nextInt();
    int n3 = scan.nextInt();
    int total = n1 + n2 + n3;
    int votes[] = new int[total];
    for (int i = 0; i < total; i++) {
      votes[i] = scan.nextInt();
    }
    Arrays.sort(votes);
    int count = 0;

    for (int i = 0; i < votes.length - 1; i++) {
      if (votes[i] == votes[i + 1]) {
        count++;
        i++;
      }
    }
    System.out.println(count);

    for (int i = 0; i < votes.length - 1; i++) {
      if (votes[i] == votes[i + 1]) {
        System.out.println(votes[i]);
        i++;
      }
    }
    scan.close();
  }
}
