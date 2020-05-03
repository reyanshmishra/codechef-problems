import java.util.*;

class CANDY123 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int Limak = scan.nextInt();
            int Bob = scan.nextInt();

            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                if (i % 2 == 0) {
                    Bob -= i;
                    if (Bob < 0) {
                        System.out.println("Limak");
                        break;
                    }
                } else {
                    Limak -= i;
                    if (Limak < 0) {
                        System.out.println("Bob");
                        break;
                    }
                }
            }

            T--;
        }
        scan.close();
    }
}
