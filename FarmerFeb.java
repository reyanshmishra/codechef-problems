import java.util.*;

class FarmerFeb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int firstLine = scan.nextInt();
            int secLine = scan.nextInt();

            int thirdLine = 0;
            while (true) {
                thirdLine++;
                int total = firstLine + secLine + thirdLine;
                if (isPrime(total)) {
                    break;
                }
            }

            System.out.println(thirdLine);
            T--;
        }
        scan.close();
    }

    static boolean isPrime(int total) {
        double sqr = Math.sqrt(total);
        boolean prime = true;
        for (int i = 2; i <= sqr; i++) {
            if (total % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
