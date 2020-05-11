import java.util.*;

class TALAZY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {

            int N = scan.nextInt();
            int B = scan.nextInt();
            int M = scan.nextInt();

            while (N > 0) {
                if (N % 2 == 0)
                    N = N / 2;
                else
                    N = (N + 1) / 2;

            }

            T--;
        }
        scan.close();
    }

}
