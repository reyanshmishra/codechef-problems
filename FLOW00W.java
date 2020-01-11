
import java.util.Scanner;

/**
 *
 * @author reyansh
 */
class FLOW00W {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] notes = {100, 50, 10, 5, 2, 1};
        int money[] = new int[scan.nextInt()];

        for (int i = 0; i < money.length; i++) {
            money[i] = scan.nextInt();
        }

        for (int number : money) {
            int totalNotes = 0;
            int leftOver = number;
            for (int note : notes) {
                if (leftOver >= note) {
                    int requiredNotes = leftOver / note;
                    leftOver = leftOver % note;
                    totalNotes = totalNotes + requiredNotes;
                }
            }
            System.out.println(totalNotes);
        }
        scan.close();
    }
}
