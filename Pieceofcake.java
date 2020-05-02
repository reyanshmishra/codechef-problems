import java.util.*;

class Pieceofcake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            String string = scan.next();
            HashMap<Character, Integer> hm = new HashMap<>();
            String result = "NO";
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                if (hm.containsKey(c)) {
                    result = "YES";
                    break;
                } else {
                    hm.put(c, 1);
                }
            }
            System.out.println(result);

            T--;
        }
        scan.close();
    }
}
