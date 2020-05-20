import java.util.*;

class HORSES {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int skills[] = new int[N];
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < skills.length; i++) {
                skills[i] = scan.nextInt();
            }

            for (int i = 0; i < skills.length; i++) {
                for (int j = i + 1; j < skills.length; j++) {
                    int A = skills[i];
                    int B = skills[j];
                    int diff = A > B ? A - B : B - A;
                    if (diff < min) {
                        min = diff;
                    }
                }
            }
            System.out.println(min);

            T--;
        }
        scan.close();
    }
}
