import java.util.Scanner;

class GCDandLCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            int gcd = GCD(A, B);
            System.out.println(gcd + " " + (A * B) / gcd);
            T--;
        }
        scan.close();
    }

    static int GCD(int a, int b) {
        if (a == 0)
            return b;
        return GCD(b % a, a);
    }
}
