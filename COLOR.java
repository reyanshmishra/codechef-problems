import java.util.*;


class COLOR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            char[] colors = scan.next().toCharArray();
            int r = 0, g = 0, b = 0;

            for (int i = 0; i < colors.length; i++) {
                if (colors[i] == 'R') {
                    r++;
                }
                if (colors[i] == 'G') {
                    g++;
                }
                if (colors[i] == 'B') {
                    b++;
                }
            }
            int max = Math.max(Math.max(r, g), b);
            System.out.println(N - max);

            T--;
        }
        scan.close();
    }
}
