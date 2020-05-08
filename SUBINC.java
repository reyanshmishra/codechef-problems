
import java.util.*;

class SUBINC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();

            long arr[] = new long[N];
            long res[] = new long[N];

            for (int i = 0; i < N; i++) {
                arr[i] = scan.nextLong();
            }

            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    res[i] = 1;
                } else if (arr[i] >= arr[i - 1]) {
                    res[i] = res[i - 1] + 1;
                } else {
                    res[i] = 1;
                }
            }

            System.out.println(Arrays.stream(res).sum());

            T--;
        }
        scan.close();
    }

}
