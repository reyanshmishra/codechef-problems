import java.util.*;


class TWONMS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            long A = scan.nextLong();
            long B = scan.nextLong();
            long N = scan.nextLong();
            if (N % 2 == 0)
                System.out.println(Math.max(A, B) / Math.min(A, B));
            else
                System.out.println(Math.max(2 * A, B) / Math.min(2 * A, B));

            T--;
        }
        scan.close();
    }
}
