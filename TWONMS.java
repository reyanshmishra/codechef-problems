import java.util.*;


class TWONMS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {

            int A = scan.nextInt();
            int B = scan.nextInt();
            int N = scan.nextInt();

            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    A *= 2;
                } else {
                    B *= 2;
                }
            }
            System.out.println(Math.max(A, B) / Math.min(A, B));

            T--;
        }
        scan.close();
    }
}
