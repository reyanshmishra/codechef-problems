import java.util.*;

class CONFLIP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int G = scan.nextInt();


            while (G-- > 0) {
                // state of coins 1= head 2 =tail
                int I = scan.nextInt();
                // number of coins and rounds
                int N = scan.nextInt();
                // 1 or 2 guess head or tail
                int Q = scan.nextInt();
                int heads = 0;
                int tails = 0;
                if (I == 1) {
                    heads = N;
                } else {
                    tails = N;
                }
                for (int j = 1; j <= N; j++) {
                    if (j % 2 != 0 && I == 1) {
                        if (heads > 0)
                            heads--;
                        tails++;
                    }
                    if (j % 2 != 0 && I == 2) {
                        heads++;
                        if (tails > 0)
                            tails--;
                    }
                }
                System.out.println(Q == 1 ? heads : tails);
            }


            T--;
        }
        scan.close();
    }

}
