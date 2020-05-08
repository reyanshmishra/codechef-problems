
import java.util.*;

class SUBINC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            long arr[] = new long[N];

            for (int i = 0; i < N; i++) {
                arr[i] = scan.nextLong();
            }

            T--;
        }
        scan.close();
    }

}
