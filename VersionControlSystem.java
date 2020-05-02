import java.util.*;

class VersionControlSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int K = scan.nextInt();
            ArrayList<Integer> ignored = new ArrayList<>();
            ArrayList<Integer> tracked = new ArrayList<>();

            for (int i = 0; i < M; i++) {
                ignored.add(scan.nextInt());
            }

            for (int j = 0; j < K; j++) {
                tracked.add(scan.nextInt());
            }
            int trackAndIgnored = 0;
            int untrackedAndUnignored = 0;

            for (int i = 1; i <= N; i++) {
                if (ignored.contains(i) && tracked.contains(i)) {
                    trackAndIgnored++;
                }
                if (!ignored.contains(i) && !tracked.contains(i)) {
                    untrackedAndUnignored++;
                }
            }
            System.out.println(trackAndIgnored + " " + untrackedAndUnignored);

            T--;
        }
        scan.close();
    }
}
