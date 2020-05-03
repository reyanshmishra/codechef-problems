import java.util.*;


class ALPHABET {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letters = scan.next();
        int N = scan.nextInt();
        String words[] = new String[N];
        for (int i = 0; i < words.length; i++) {
            words[i] = scan.next();
        }
        String result = "Yes";
        for (String string : words) {
            for (int i = 0; i < string.length(); i++) {
                if (letters.indexOf(string.charAt(i)) == -1) {
                    result = "No";
                    break;
                }
            }
            System.out.println(result);
        }

        scan.close();
    }
}
