import java.util.*;

class AreaORPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int b = scan.nextInt();
        int peri = 2 * (b + l);
        int area = b * l;
        if (area > peri) {
            System.out.println("Area");
            System.out.println(area);
        } else if (peri > area) {
            System.out.println("Peri");
            System.out.println(peri);
        } else {
            System.out.println("Eq");
            System.out.println(area);
        }
        scan.close();
    }
}
