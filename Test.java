
public class Test {

    public static void main(String[] args) {
        boolean x = false;
        boolean y = false;
        boolean xXorY = x ^ y;
        System.out.println("false XOR false: " + xXorY);
        x = false;
        y = true;
        xXorY = x ^ y;
        System.out.println("false XOR true: " + xXorY);
        x = true;
        y = false;
        xXorY = x ^ y;
        System.out.println("true XOR false: " + xXorY);
        x = true;
        y = true;
        xXorY = x ^ y;
        System.out.println("true XOR true: " + xXorY);
    }
}
