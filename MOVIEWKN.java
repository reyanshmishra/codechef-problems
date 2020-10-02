import java.util.*;

class MOVIEWKN {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int N = scan.nextInt();
            int movies[][] = new int[2][N];

            int ans = 0;
            int lnr = 0;
            int rat = 0;

            for (int i = 0; i < N; i++) {
                movies[0][i] = scan.nextInt();
            }

            for (int i = 0; i < N; i++) {
                movies[1][i] = scan.nextInt();
            }

            for (int i = 0; i < N; i++) {
                int l = movies[0][i];
                int r = movies[1][i];
                if (l * r > lnr) {
                    lnr = l * r;
                    rat = r;
                    ans = i;
                } else if (l * r == lnr && r > rat) {
                    ans = i;
                    rat = r;
                }
            }

            System.out.println(ans + 1);
        }
        scan.close();
    }
}
