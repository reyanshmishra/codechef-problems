/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input. //imports for BufferedReader import
 * java.io.BufferedReader; import java.io.InputStreamReader;
 *
 */
// import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class SubArray {
    public static void main(String args[]) throws Exception {
        /*
         * Sample code to perform I/O: Use either of these methods for input
         *
         * //BufferedReader BufferedReader br = new BufferedReader(new
         * InputStreamReader(System.in)); String name = br.readLine(); // Reading input from STDIN
         * System.out.println("Hi, " + name + "."); // Writing output to STDOUT
         */

        // Scanner
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T > 0) {
            int N = s.nextInt();
            int arr[] = new int[N + 1];
            int arrLength = arr.length;
            String result = "";
            for (int i = 1; i < arrLength; i++) {
                arr[i] = s.nextInt();
            }

            for (int i = 1; i < arrLength; i++) {
                int v = arr[i];
                int right = 0;
                int left = 0;
                for (int j = i + 1; j < arrLength; j++) {
                    if (v < arr[j]) {
                        right++;
                    } else {
                        break;
                    }
                }


                for (int j = i - 1; j > 0; j--) {
                    if (v < arr[j]) {
                        left++;
                    } else {
                        break;
                    }
                }
                int calc = (left + right) + (left * right + 1);
                result += " " + calc;
            }
            s.close();
            System.out.println(result.trim()); // Writing output to STDOUT
            T--;
        }



    }
}
