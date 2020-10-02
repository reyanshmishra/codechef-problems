import java.util.*;

class CONFLIP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int G = scan.nextInt();

            while (G-- > 0) {
                // state of coins 1=head 2=tail
                int I = scan.nextInt();
                // number of coins and rounds
                int N = scan.nextInt();
                // 1 or 2 guess head or tail
                int Q = scan.nextInt();
                if (N % 2 == 0) {
                    System.out.println(N / 2);
                } else {
                    if (I == Q) {
                        System.out.println(N / 2);
                    } else {
                        System.out.println((N / 2) + 1);
                    }
                }
            }
            T--;
        }
        scan.close();
    }

}
