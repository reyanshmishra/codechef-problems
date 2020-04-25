import java.util.Scanner;

class CuttingRecipes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while (T > 0) {
            int ar[] = new int[scan.nextInt()];

            for (int i = 0; i < ar.length; i++) {
                ar[i] = scan.nextInt();
            }
            int gcd = getGCD(ar);
            for (int i : ar) {
                System.out.println(i / gcd);
            }
            T--;
        }
        scan.close();
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int getGCD(int arr[]) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(arr[i], result);

            if (result == 1) {
                return 1;
            }
        }

        return result;
    }

}
