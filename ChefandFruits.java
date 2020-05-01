import java.util.*;

class ChefandFruits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int apples = scan.nextInt();
            int oranges = scan.nextInt();
            int coins = scan.nextInt();

            for (int i = 1; i <= coins; i++) {
                if (apples < oranges) {
                    apples++;
                } else if (apples > oranges) {
                    oranges++;
                }
            }
            System.out.println(apples > oranges ? apples - oranges : oranges - apples);

            T--;
        }
        scan.close();
    }
}
