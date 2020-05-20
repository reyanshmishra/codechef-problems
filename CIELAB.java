import java.util.*;


class CIELAB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        long B = scan.nextLong();
        long ans = A - B;

        if (ans < 0) {
            ans *= -1;
            ans = ans - 1;
        }

        System.out.println(ans);
        scan.close();
    }
}
