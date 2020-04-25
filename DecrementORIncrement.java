import java.util.Scanner;

class DecrementORIncrement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if (N % 4 == 0) {
            N++;
        } else {
            N--;

        }
        System.out.println(N);
        scan.close();
    }
}
