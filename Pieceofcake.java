import java.util.*;

class Pieceofcake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            String string = scan.next();
            char[] chars = string.toCharArray();
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                    }
                }
            }
            if (count == chars.length / 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            T--;
        }
        scan.close();
    }
}
