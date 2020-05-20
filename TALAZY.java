import java.util.*;

class TALAZY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {

            long N = scan.nextLong();
            long B = scan.nextLong();
            long M = scan.nextLong();
            long time = 0;
            while (N > 0) {
                long solved = 0;
                if (N % 2 == 0) {
                    solved = (N / 2);
                    N = N - solved;
                } else {
                    solved = ((N + 1) / 2);
                    N = N - solved;
                }
                if (N > 0) {
                    time = time + (solved * M) + B;
                } else {
                    time = time + (solved * M);
                }
                M = M * 2;
            }
            System.out.println(time);
            T--;
        }
        scan.close();
    }

}
