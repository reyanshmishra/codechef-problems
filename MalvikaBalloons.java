import java.util.*;

class MalvikaBalloons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            String baloons = scan.next();
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < baloons.length(); i++) {
                char c = baloons.charAt(i);
                if (hm.containsKey(c)) {
                    int value = hm.get(c);
                    hm.put(c, value + 1);
                } else {
                    hm.put(c, 1);
                }
            }
            int a = hm.containsKey('a') ? hm.get('a') : 0;
            int b = hm.containsKey('b') ? hm.get('b') : 0;

            if (a == b) {
                System.out.println(a);
            } else if (a == 0 || b == 0) {
                System.out.println(0);
            } else {
                System.out.println(a > b ? b : a);
            }
            T--;
        }
        scan.close();
    }
}
