import java.util.*;

class KitchenTimetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int GT[] = new int[N + 1];
            int canCook = 0;

            for (int i = 1; i <= N; i++) {
                GT[i] = scan.nextInt();
            }
            for (int i = 1; i <= N; i++) {
                int required = scan.nextInt();
                if (required <= GT[i] - GT[i - 1]) {
                    canCook++;
                }
            }
            System.out.println(canCook);
            T--;
        }
        scan.close();
    }

}
