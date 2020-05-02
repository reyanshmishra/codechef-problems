import java.util.*;

class RAINBOWA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scan.nextInt();
            }

            String result = "yes";
            for (int i = 1; i <= N - 1 / 2; i++) {
                if (arr[(N - 1) / 2] != arr[((N - 1) / 2) - 1] + 1) {
                    result = "no";
                    break;
                }
                if (arr[i - 1] != arr[N - i]) {
                    result = "no";
                    break;
                }
            }
            System.out.println(result);

            T--;
        }
        scan.close();

    }
}
