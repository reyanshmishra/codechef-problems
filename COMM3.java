import java.util.*;

class COMM3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int distance = scan.nextInt();

            int x1 = scan.nextInt();
            int y1 = scan.nextInt();

            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            int x3 = scan.nextInt();
            int y3 = scan.nextInt();

            double d1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            double d2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
            double d3 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

            if (d1 <= distance && d2 <= distance || d2 <= distance && d3 <= distance
                    || d1 <= distance && d3 <= distance) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            T--;
        }
        scan.close();
    }

}
