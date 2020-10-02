import java.util.Scanner;

class WATMELON {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int N = scan.nextInt();
            int total = 0;
            for (int i = 0; i < N; i++) {
                int no = scan.nextInt();
                total += no;
            }
            System.out.println(total >= 0 ? "YES" : "NO");
        }
        scan.close();
    }
}
