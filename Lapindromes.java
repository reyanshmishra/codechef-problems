/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String str = sc.nextLine();
            String str1 = str.substring(0, str.length() / 2);
            String str2 = str.substring((str.length() + 1) / 2, str.length());

            char[] array1 = str1.toCharArray();
            char[] array2 = str2.toCharArray();;
            Arrays.sort(array1);
            Arrays.sort(array2);

            if (new String(array1).equals(new String(array2))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
