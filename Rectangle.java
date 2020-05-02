
import java.util.*;

class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();

            if ((a == b && c == d) || (a == c && b == d) || (a == d && c == b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            T--;
        }
        scan.close();
    }

}
