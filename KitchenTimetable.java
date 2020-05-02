import java.util.*;

class KitchenTimetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int RT[] = new int[N];
            for (int i = 1; i <= N; i++) {
                RT[i] = scan.nextInt();
            }

            int canCook = 0;

            for (int i = 1; i <= RT.length; i++) {
            }
            System.out.println("" + canCook);
            T--;
        }
        scan.close();
    }

}
