import java.util.*;

class STRPALIN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            String A = scan.next();
            String B = scan.next();
            boolean isPal = false;
            for (int i = 0; i < A.length(); i++) {
                char one = A.charAt(i);
                for (int j = 0; j < B.length(); j++) {
                    if (one == B.charAt(j)) {
                        isPal = true;
                    }
                }
                if (isPal) {
                    break;
                }
            }
            System.out.println(isPal ? "Yes" : "No");

            T--;
        }
        scan.close();
    }

}
