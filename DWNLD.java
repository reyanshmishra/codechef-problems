import java.util.*;

class DWNLD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            int usage[][] = new int[N][2];
            int ans = 0;
            for (int i = 0; i < N; i++) {
                usage[i][0] = scan.nextInt();
                usage[i][1] = scan.nextInt();
            }

            for (int i = 0; i < N; i++) {
                int t = usage[i][0];
                int d = usage[i][1];
                if (K > 0 && K > t) {
                    K = K - t;
                    t = 0;
                } else if (K > 0 && K <= t) {
                    t = t - K;
                    K = 0;
                }
                ans += t * d;
            }
            System.out.println(ans);
            T--;
        }
        scan.close();
    }
}
