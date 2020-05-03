import java.util.Scanner;

class ClosingtheTweets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        int tweets[] = new int[N];
        int openedTweets = 0;

        while (K > 0) {
            String s = scan.next();
            if (s.equals("CLOSEALL")) {
                for (int i = 0; i < tweets.length; i++) {
                    tweets[i] = 0;
                    openedTweets = 0;
                }
            } else {
                int click = scan.nextInt();
                if (tweets[click - 1] == 0) {
                    tweets[click - 1] = 1;
                    openedTweets++;
                } else {
                    tweets[click - 1] = 0;
                    openedTweets--;
                }
            }
            K--;
            System.out.println(openedTweets);
        }
        scan.close();
    }
}
