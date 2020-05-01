
import java.util.*;

class CoinsAndTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int coins = scan.nextInt();
            int levels = 0;
            for (int i = 1; i <= coins; i++) {
                if (coins < levels) {
                    break;
                }
                coins -= i;
                levels++;
            }
            System.out.println(levels);
            T--;
        }
        scan.close();
    }

}
