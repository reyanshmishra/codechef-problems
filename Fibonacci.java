
class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }

    static int fibo(int n) {
        System.out.println(n);
        if (n <= 2) {
            return 1;
        }
        return fibo(n - 2) + fibo(n - 1);
    }

}
