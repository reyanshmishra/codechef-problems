import java.util.*;

class Test {
    public static void main(String[] args) {
        String s1 = "yes";
        String s2 = "yes";
        String s3 = new String(s1);
        System.out.println(s3 == s2);
    }
}
