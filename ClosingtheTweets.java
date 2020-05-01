import java.util.Scanner;

class ClosingtheTweets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int openedTweets = 0;

        String clicks[] = new String[scan.nextInt()];
        scan.nextLine();
        for (int i = 0; i < clicks.length; i++) {
            clicks[i] = scan.next();
        }
        for (String string : clicks) {
            if (string.equals("CLOSEALL")) {
                openedTweets = 0;
            } else {
                if (openedTweets == 0 || openedTweets < N) {
                    openedTweets++;
                } else {
                    openedTweets--;
                }
            }
            System.out.println(openedTweets);
        }
        scan.close();
    }
}
