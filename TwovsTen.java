import java.util.*;

class TwovsTen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int values[] = new int[scan.nextInt()];
        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }

        for (int X : values) {
            if (X % 10 == 0) {
                System.out.println("0");
            } else if (X % 5 == 0) {
                System.out.println("1");
            } else {
                System.out.println("-1");
            }
        }
        scan.close();
    }
}
