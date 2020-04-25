import java.util.Scanner;

class FitSquaresinTriangle {
    static int maxSquare(int b, int m) {
        return (b / m - 1) * (b / m) / 2;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while (T > 0) {
            int base = scan.nextInt();
            System.out.println(maxSquare(base, 2));
            T--;
        }

        scan.close();
    }
}
