import java.util.Scanner;

class GCDandLCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long T = scan.nextLong();
        while (T > 0) {
            long A = scan.nextLong();
            long B = scan.nextLong();
            long gcd = GCD(A, B);
            System.out.println(gcd + " " + (A * B) / gcd);
            T--;
        }
        scan.close();
    }

    static long GCD(long a, long b) {
        if (a == 0)
            return b;
        return GCD(b % a, a);
    }
}
