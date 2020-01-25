
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author reyansh
 */
class PERMUT2 {
    public static void main(String[] args) {
        List<int[]> l = new ArrayList<int[]>();

        Scanner scan = new Scanner(System.in);

        while (true) {
            int arrayLength = scan.nextInt();
            if (arrayLength == 0) {
                break;
            }
            int array[] = new int[arrayLength];
            for (int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
            }
            l.add(array);
        }

        System.out.println("===" + l.size());
        for (int[] array : l) {

            int newarray[] = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                int digit = array[i];
                newarray[digit - 1] = digit;
            }
            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(newarray));

            if (Arrays.equals(array, newarray)) {
                System.out.println("ambiguous");
            } else {
                System.out.println("not ambiguous");
            }
        }

        scan.close();
    }
}
