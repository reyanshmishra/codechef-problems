import java.util.*;


class CIELAB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        long B = scan.nextLong();
        long ans = A - B;
        if (ans == 0) {
            System.out.println(1);
        } else if (ans % 10 == 9) {
            System.out.println(ans - 1);
        } else {
            System.out.println(ans + 1);
        }
        scan.close();
    }
}
