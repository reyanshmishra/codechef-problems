import java.util.*;

class RECTSQ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int b = scan.nextInt();
            int l = scan.nextInt();

            int gcd = gcd(b, l);
            int resilt = (b * l) / (gcd * gcd);
            System.out.println(resilt);
            T--;
        }
        scan.close();
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
