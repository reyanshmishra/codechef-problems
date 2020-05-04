
import java.util.*;

class CATSDOGS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int C = scan.nextInt();
            int D = scan.nextInt();
            int L = scan.nextInt();
            int totalLegs = C * 4 + D * 4;

            if (L == totalLegs || (totalLegs / 2) == L) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }


            T--;
        }
        scan.close();
    }

}
