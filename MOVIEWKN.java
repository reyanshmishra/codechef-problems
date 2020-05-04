import java.util.*;

class MOVIEWKN {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        ArrayList<Movie> movies = new ArrayList<>();
        while (T > 0) {
            int N = scan.nextInt();
            int length[] = new int[N];

            for (int i = 0; i < N; i++) {
                length[i] = scan.nextInt();
            }

            for (int i = 0; i < N; i++) {
                int len = length[i];
                int rating = scan.nextInt();
                int total = len * rating;
                Movie mv = new Movie(total, rating, i);
                movies.add(mv);

            }
            Movie toWatch = null;
            for (int i = 0; i < length.length; i++) {
                Movie mv = movies.get(i);
                for (int j = i + 1; j < length.length; j++) {
                    Movie secMv = movies.get(j);
                    if (mv.total > secMv.total && mv.rating > secMv.rating
                            && mv.index < secMv.index) {
                        toWatch = mv;
                    } else {
                        toWatch = secMv;
                    }
                }
            }
            System.out.println(toWatch.index + 1);
            T--;
        }
        scan.close();
    }
}


class Movie {
    int total = 0;
    int rating = 0;
    int index = 0;

    Movie(int total, int rating, int index) {
        this.total = total;
        this.rating = rating;
        this.index = index;
    }

}
