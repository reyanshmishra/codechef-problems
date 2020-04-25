import java.util.Scanner;

class PuppyandSum {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while (T > 0) {
            int D = scan.nextInt();
            int totalSum = scan.nextInt();
            while (D > 0) {
                totalSum = summation(totalSum);
                D--;
            }
            System.out.println(totalSum);
            T--;
        }
        scan.close();
    }

    static int summation(int n) {
        return n * (n + 1) / 2;
    }

}
