import java.util.*;

class Chefanddigitsofanumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            String digit = scan.next();
            int zeros = 0;
            int ones = 0;
            for (int i = 0; i < digit.length(); i++) {
                if (digit.charAt(i) == '1') {
                    ones++;
                } else {
                    zeros++;
                }
            }
            if (zeros == 1 || ones == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            T--;
        }
        scan.close();
    }
}
