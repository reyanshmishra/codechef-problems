import java.util.Scanner;

class TotalExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {

            double quantity = scan.nextDouble();
            double price = scan.nextDouble();
            double total = quantity * price;
            if (quantity >= 1000) {
                System.out.println(String.format("%.6f", total - total / 100 * 10));
            } else {
                System.out.println(String.format("%.6f", total));
            }
            T--;
        }
        scan.close();
    }
}
