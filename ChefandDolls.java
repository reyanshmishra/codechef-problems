import java.util.*;

class ChefandDolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            HashMap<Integer, Integer> hash = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int value = scan.nextInt();
                if (hash.containsKey(value)) {
                    hash.put(value, hash.get(value) + 1);
                } else {
                    hash.put(value, 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (value % 2 != 0) {
                    System.out.println(key);
                }
            }

            T--;
        }
        scan.close();
    }
}
