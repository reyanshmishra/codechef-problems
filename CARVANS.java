import java.util.*;


class CARVANS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int cars[] = new int[N];
            int highSpeed = Integer.MAX_VALUE;
            int count = 0;

            for (int i = 0; i < cars.length; i++) {
                int c = scan.nextInt();
                if (c <= highSpeed) {
                    count++;
                    highSpeed = c;
                }
            }
            System.out.println(count);

            T--;
        }
        scan.close();
    }

}
