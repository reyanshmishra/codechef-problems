
import java.util.Scanner;

/**
 *
 * @author reyansh
 */
class PERMUT2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            int arrayLength = scan.nextInt();
            if (arrayLength == 0) {
                break;
            }
            String isAmbiguas = "ambiguous";

            int array[] = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                array[i] = scan.nextInt();
            }

            for (int i = 1; i <= arrayLength; i++) {
                int elm = array[i - 1];

                if (elm < 0 || elm > arrayLength) {
                    isAmbiguas = "ambiguous";
                    break;
                }
                if (array[elm - 1] != i) {
                    isAmbiguas = "not ambiguous";
                }
            }

            System.out.println(isAmbiguas);
        }


        scan.close();
    }
}
