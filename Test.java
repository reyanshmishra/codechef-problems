import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Test { // Complete the sockMerchant function below.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {

            int a = scan.nextInt();
            int b = scan.nextInt();
            for (int i = a; i <= b; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }

        }
        scan.close();
    }

    static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

}
