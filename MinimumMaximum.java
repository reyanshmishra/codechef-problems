
import java.util.*;
import java.io.*;

class MinimumMaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter print = new PrintWriter(System.out);

        int T = scan.nextInt();
        while (T > 0) {
            long arr[] = new long[scan.nextInt()];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextLong();
            }

            print.println(arr[0] * arr.length - 1);
            T--;
        }
        scan.close();
    }
}
