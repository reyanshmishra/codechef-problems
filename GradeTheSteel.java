import java.util.*;

class GradeTheSteel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            double h = scan.nextDouble();
            double c = scan.nextDouble();
            double t = scan.nextDouble();

            int grade = 0;

            if (h > 50 && c < 0.7 && t > 5600) {
                grade = 10;
            } else if (h > 50 && c < 0.7) {
                grade = 9;
            } else if (c < 0.7 && t > 5600) {
                grade = 8;
            } else if (h > 50 && t > 5600) {
                grade = 7;
            } else if (h > 50 || c < 0.7 || t > 5600) {
                grade = 6;
            } else {
                grade = 5;
            }
            System.out.println(grade);
            T--;
        }
        scan.close();
    }
}
