
import java.util.*;

class STICKS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int arr[] = new int[N];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            int w = 0;
            int res = -1;

            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] == arr[i - 1]) {
                    if (w == 0) {
                        w = arr[i];
                    } else {
                        res = w * arr[i];
                        break;
                    }
                }
            }
            System.out.println(res);

            T--;
        }
        scan.close();
    }
}
