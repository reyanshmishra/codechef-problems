import java.util.*;


class CHEFSQ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int string[] = new int[scan.nextInt()];

            for (int i = 0; i < string.length; i++) {
                string[i] = scan.nextInt();
            }
            int sub[] = new int[scan.nextInt()];
            for (int i = 0; i < sub.length; i++) {
                sub[i] = scan.nextInt();
            }
            boolean found = false;
            int subi = 0;
            for (int i : string) {
                if (i == sub[subi]) {
                    subi++;
                    if (subi == sub.length) {
                        System.out.println("Yes");
                        found = true;
                        break;
                    }
                }
            }
            if (!found)
                System.out.println("No");

            T--;
        }
        scan.close();
    }

}
