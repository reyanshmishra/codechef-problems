
class Fibonacci {

    static int n = 6;

    public static void main(String[] args) {
        int x = 0, y = 1, z = 0;
        for (int i = 2; i <= n; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        // System.out.println(z);
        System.out.println(fibo(n));
    }

    static double mem[] = new double[n + 1];

    static double fibo(double n) {
        if (n <= 2)
            return 1;
        double first = fibo(n - 2);
        double sec = fibo(n - 1);
        return first + sec;
    }

}
