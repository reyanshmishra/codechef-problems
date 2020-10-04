import java.util.*;


class NUKES {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();// Number of particles
        int N = scan.nextInt();// Max particle
        int K = scan.nextInt();// Chambers
        int chambers[] = new int[K];

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < K; j++) {
                chambers[j]++;
                if (chambers[j] > N) {
                    chambers[j] = 0;
                } else {
                    break;
                }
            }
        }
        for (int i : chambers)
            System.out.print(i + " ");

        scan.close();
    }
}
