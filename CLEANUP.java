import java.util.*;


class CLEANUP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            ArrayList<Integer> jobs = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                jobs.add(scan.nextInt());
            }

            String chefsJob = "";
            String assJobs = "";
            boolean turn = false;
            for (int i = 1; i <= N; i++) {
                if (!jobs.contains(i)) {
                    if (turn) {
                        assJobs += " " + i;
                        turn = false;
                    } else {
                        chefsJob += " " + i;
                        turn = true;
                    }

                }
            }
            System.out.println(chefsJob.trim());
            System.out.println(assJobs.trim());

            T--;
        }
        scan.close();
    }
}
