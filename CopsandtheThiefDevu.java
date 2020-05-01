
import java.util.*;

class CopsandtheThiefDevu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int copsInHouses = scan.nextInt();
            int perminHouses = scan.nextInt();
            int forMins = scan.nextInt();

            int m[] = new int[copsInHouses];
            for (int i = 0; i < copsInHouses; i++) {
                m[i] = scan.nextInt();
            }
            int totalScannedHouses = perminHouses * forMins;
            int leftSide = -1;
            int rightSide = -1;

            for (int i = 0; i < m.length; i++) {

                int coverLeftSide = m[i] - totalScannedHouses;
                int coverRightSide = m[i] + totalScannedHouses;

                if (leftSide == -1 && leftSide < coverLeftSide && leftSide < 0) {
                    leftSide = coverLeftSide;
                }
                if (rightSide < coverRightSide && coverRightSide < 100) {
                    rightSide = coverRightSide;
                }
            }
            System.out.println(rightSide + ":" + leftSide);

            T--;
        }
        scan.close();
    }
}
