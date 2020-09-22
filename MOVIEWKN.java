import java.util.*;

class MOVIEWKN {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int N = scan.nextInt();
            int length[] = new int[N];
            int rating[] = new int[N];
            int maxLR = 0;
            int maxR = 0;
            int ans = 0;

            for (int i = 0; i < N; i++) {
                length[i] = scan.nextInt();
                rating[i] = scan.nextInt();
                if (length[i] * rating[i] > maxLR) {
                    maxLR = length[i] * rating[i];
                    maxR = rating[i];
                    ans = i;
                } else if (rating[i] > maxR) {
                    maxR = rating[i];
                    ans = i;
                }
            }
            System.out.println(ans);
        }
        scan.close();
    }
}
