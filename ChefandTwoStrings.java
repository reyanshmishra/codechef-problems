
import java.util.*;

class ChefandTwoStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();


        while (T > 0) {
            String firstIn = scan.next();
            String secIn = scan.next();
            int minDiff = 0;
            int maxDiff = 0;

            for (int i = 0; i < firstIn.length(); i++) {
                char firstC = firstIn.charAt(i);
                char secC = secIn.charAt(i);
                if (isAlpha(firstC) && isAlpha(secC) && firstC != secC) {
                    minDiff++;
                } else if (isAlpha(firstC) && isAlpha(secC) && firstC == secC) {

                } else {
                    maxDiff++;
                }
            }
            System.out.println(minDiff + " " + (minDiff + maxDiff));

            T--;
        }
        scan.close();
    }

    static boolean isAlpha(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;

        }
        return false;
    }
}
