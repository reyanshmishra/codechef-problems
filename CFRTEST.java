import java.util.*;

class CFRTEST {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            HashMap<Integer, Boolean> hash = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int day = scan.nextInt();
                if (!hash.containsKey(day)) {
                    hash.put(day, true);
                }
            }
            System.out.println(hash.size());

            T--;
        }
        scan.close();
    }

}
