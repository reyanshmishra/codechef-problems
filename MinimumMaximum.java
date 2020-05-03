
import java.util.*;

class MinimumMaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        while (T > 0) {
            long arr[] = new long[scan.nextInt()];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextLong();
            }
            Arrays.sort(arr);

            long result = arr[0] * (arr.length - 1);
            System.out.println(result);

            T--;
        }
        scan.close();
    }
}
