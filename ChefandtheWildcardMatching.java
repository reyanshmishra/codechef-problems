import java.util.*;

class ChefandtheWildcardMatching {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            String first = scan.next();
            String sec = scan.next();
            String matched = "Yes";
            for (int i = 0; i < first.length(); i++) {
                char firstC = first.charAt(i);
                char secC = sec.charAt(i);
                if (isAlpha(firstC) && isAlpha(secC) && firstC != secC) {
                    matched = "No";
                    break;
                }
            }
            System.out.println(matched);

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
