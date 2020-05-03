
import java.util.*;

class CopsandtheThiefDevu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int copsInHouses = scan.nextInt();
            int perminHouses = scan.nextInt();
            int forMins = scan.nextInt();
            int houses[] = new int[100];
            int totalCops = perminHouses * forMins;


            for (int i = 0; i < copsInHouses; i++) {
                int m = scan.nextInt();
                int from = m - totalCops < 1 ? 1 : m - totalCops;
                int till = m + totalCops > 100 ? 100 : m + totalCops;
                for (int j = from; j <= till; j++) {
                    houses[j - 1] = 1;
                }
            }

            int safeHouses = 0;
            for (int i : houses) {
                if (i == 0) {
                    safeHouses++;
                }
            }
            System.out.println(safeHouses);

            T--;
        }
        scan.close();
    }
}
