import java.util.Scanner;

class WATMELON {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int seq[] = new int[N];

            for (int i = 0; i < N; i++) {
                seq[i] = scan.nextInt();
            }
            boolean good = false;

            if (N == 1) {
                if (seq[0] == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                T--;
                continue;
            }

            for (int i = 0; i < seq.length; i++) {
                if (seq[i] == i + 1) {
                    good = true;
                } else {
                    good = false;
                    break;
                }
            }
            System.out.println(good ? "YES" : "NO");
            T--;
        }
        scan.close();
    }

}
