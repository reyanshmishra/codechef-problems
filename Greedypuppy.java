import java.util.Scanner;

class Greedypuppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int coins = scan.nextInt();
            int barked = scan.nextInt();
            int mx = 0;
            for (int i = 1; i <= barked; i++) {
                if (mx <= coins % i) {
                    mx = coins % i;
                }
            }
            System.out.println(mx);
            T--;
        }
        scan.close();
    }
}
