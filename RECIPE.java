
import java.util.Scanner;

/**
 *
 * @author reyansh
 */
class RECIPE {

    static int gcd(int a, int b) {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        while (tests > 0) {



            tests--;
        }


        scan.close();
    }
}
