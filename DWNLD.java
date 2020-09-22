import java.util.*;

class DWNLD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            int usage[][] = new int[N][2];

            for (int i = 0; i < usage.length; i++) {
                usage[i][0] = scan.nextInt();
                usage[i][1] = scan.nextInt();
            }
            int res = 0;
            for (int i = 0; i < usage.length; i++) {
                int min = usage[i][0];
                if (K > 0) {
                    min = K - min > 0 ? 0 : min - K;
                    K = K >= usage[i][0] ? K - usage[i][0] : usage[i][0] - K;
                }
                res += min * usage[i][1];
            }
            System.out.println(res);
            T--;
        }
        scan.close();
    }
}
