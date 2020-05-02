import java.util.*;

class HOWMANYDIGITS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String T = scan.next();
        int number = T.length();
        if (number < 4) {
            System.out.println("" + number);
        } else {
            System.out.println("More than 3 digits");
        }

        scan.close();

    }
}
