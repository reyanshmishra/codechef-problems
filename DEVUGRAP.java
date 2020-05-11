import java.util.*;

class DEVUGRAP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int noBaskets = scan.nextInt();
            int num = scan.nextInt();
            int baskets[] = new int[noBaskets];
            int operations = 0;

            for (int i = 0; i < noBaskets; i++) {
                baskets[i] = scan.nextInt();
            }

            for (int i = 0; i < baskets.length; i++) {
                int grapes = baskets[i];
                int a = grapes / num;
                int b = num * a++;

            }


            T--;
        }
        scan.close();
    }

}
