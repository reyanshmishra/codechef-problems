import java.util.*;


class JOHNY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int N = scan.nextInt();
            int songs[] = new int[N];

            for (int i = 0; i < songs.length; i++) {
                songs[i] = scan.nextInt();
            }
            int fav = songs[scan.nextInt() - 1];
            Arrays.sort(songs);

            System.out.println(searchSong(songs, fav));

            T--;
        }
        scan.close();
    }

    static int searchSong(int songs[], int fav) {
        int l = 0, h = songs.length - 1;
        int found = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (songs[mid] == fav) {
                found = mid + 1;
                break;
            } else if (songs[mid] > fav) {
                h = mid - 1;
            } else if (songs[mid] < fav) {
                l = mid + 1;
            }
        }
        return found;
    }
}
