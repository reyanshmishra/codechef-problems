import java.util.Arrays;
import java.util.Scanner;

class TheSmallestPair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int arr[] = new int[scan.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            int i = arr[0];
            int j = arr[1];
            System.out.println(i + j);
            T--;
        }
        scan.close();
    }

}
