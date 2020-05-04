import java.util.*;

class CCOOK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {

            int level = 0;
            for (int i = 0; i < 5; i++) {
                int value = scan.nextInt();
                if (value == 1) {
                    level++;
                }
            }

            switch (level) {
                case 0:
                    System.out.println("Beginner");
                    break;
                case 1:
                    System.out.println("Junior Developer");
                    break;
                case 2:
                    System.out.println("Middle Developer");
                    break;
                case 3:
                    System.out.println("Senior Developer");
                    break;
                case 4:
                    System.out.println("Hacker");
                    break;
                case 5:
                    System.out.println("Jeff Dean");
                    break;
                default:
                    break;
            }

            T--;
        }
        scan.close();
    }
}
