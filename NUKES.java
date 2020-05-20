import java.util.*;


class NUKES {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int N = scan.nextInt();
        int K = scan.nextInt();
        int chambers[] = new int[K];
        Arrays.sort(chambers);
        int i = 0;
        while (A-- > 0) {
            if (i > N) {
                i = 0;
            }
            if (chambers[i] < N) {
                chambers[i]++;
            } else {
                chambers[i] = 0;
                chambers[i + 1]++;
            }
        }
        System.out.println(Arrays.toString(chambers));

        scan.close();
    }
}
