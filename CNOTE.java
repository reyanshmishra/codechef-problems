import java.util.*;

class CNOTE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int X = scan.nextInt();
            int Y = scan.nextInt();
            int budget = scan.nextInt();
            int N = scan.nextInt();


            int leftPages = X - Y;
            String res = "UnluckyChef";
            for (int i = 0; i < N; i++) {
                int page = scan.nextInt();
                int price = scan.nextInt();
                if (budget >= price && leftPages <= page) {
                    res = "LuckyChef";
                }
            }
            System.out.println(res);



            T--;
        }
        scan.close();
    }

}
