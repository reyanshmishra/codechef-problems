import java.util.*;


class ALPHABET {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letters = scan.next();
        char[] chars = letters.toCharArray();
        ArrayList<Character> charList = new ArrayList<>();
        for (Character e : chars) {
            charList.add(e);
        }
        int N = scan.nextInt();
        String words[] = new String[N];
        for (int i = 0; i < words.length; i++) {
            String word = scan.next();
            ArrayList<Character> charList1 = new ArrayList<>();
            for (Character c : word.toCharArray()) {
                charList1.add(c);
            }
            if (charList.containsAll(charList1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }

        scan.close();
    }
}
