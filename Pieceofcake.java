import java.util.*;

class Pieceofcake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            String string = scan.next();
            int alphabets[] = new int[26];
            String result = "NO";
            int count = 0;
            for (int i = 0; i < string.length(); i++) {
                int index = string.charAt(i) - 'a';
                alphabets[index]++;
                if (alphabets[index] > count) {
                    count = alphabets[index];
                }
                if (count == string.length() - count) {
                    result = "YES";
                    break;
                }
            }

            System.out.println(result);

            T--;
        }
        scan.close();
    }
}
