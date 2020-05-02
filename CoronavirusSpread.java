import java.util.*;

class CoronavirusSpread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int people[] = new int[scan.nextInt()];
            int result[] = new int[people.length - 1];

            for (int i = 0; i < people.length; i++) {
                people[i] = scan.nextInt();
            }

            for (int i = 0; i < people.length - 1; i++) {
                int f = people[i];
                int s = people[i + 1];
                int r = s - f;
                result[i] = r;
            }

            T--;
        }
        scan.close();
    }
}
