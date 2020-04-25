import java.util.Scanner;

class SumORDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > b) {
            System.out.println(a - b);
        } else {
            System.out.println(a + b);

        }
        scan.close();
    }
}
