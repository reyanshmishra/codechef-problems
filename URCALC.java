import java.util.*;

class URCALC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        String C = scan.next();
        if (C.equals("+")) {
            System.out.println(A + B);
        }

        if (C.equals("-")) {
            System.out.println(A - B);
        }

        if (C.equals("*")) {
            System.out.println(A * B);

        }

        if (C.equals("/")) {
            System.out.println(A / B);
        }

        scan.close();
    }
}
