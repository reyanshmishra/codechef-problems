
import java.util.*;

class CHN15A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            int wolve = 0;
            for (int i = 0; i < N; i++) {
                int value = scan.nextInt();
                if ((value + K) % 7 == 0) {
                    wolve++;
                }
            }
            System.out.println(wolve);


            T--;
        }
        scan.close();
    }
}
