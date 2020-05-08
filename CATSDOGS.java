
import java.util.*;

class CATSDOGS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            long C = scan.nextLong();
            long D = scan.nextLong();
            long L = scan.nextLong();
            long maxLegs = (C + D) * 4;
            long minLegs = C <= 2 * D ? D * 4 : (C - D) * 4;
            if (L % 4 == 0 && L <= maxLegs && L >= minLegs) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            T--;
        }
        scan.close();
    }

}
