import java.util.*;

class LCH15JAB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            String string = scan.next();
            int alphabets[] = new int[26];
            int count = 0;
            for (int i = 0; i < string.length(); i++) {
                int index = string.charAt(i) - 'a';
                alphabets[index]++;
                if (alphabets[index] > count) {
                    count = alphabets[index];
                }

            }
            Arrays.sort(alphabets);
            int d = 24;
            int sum = 0;
            while (d > 0) {
                sum = sum + alphabets[d];
                d--;
            }
            if (alphabets[25] == sum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }
            T--;
        }
        scan.close();
    }
}
