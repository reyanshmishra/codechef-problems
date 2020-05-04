
import java.util.*;

class ATM2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            int people[] = new int[N];

            for (int i = 0; i < N; i++) {
                people[i] = scan.nextInt();
            }
            String result = "";
            for (int i = 0; i < people.length; i++) {
                if (K >= people[i]) {
                    K -= people[i];
                    result = result + 1;
                } else {
                    result = result + 0;
                }
            }
            System.out.println(result);

            T--;
        }
        scan.close();
    }
}
