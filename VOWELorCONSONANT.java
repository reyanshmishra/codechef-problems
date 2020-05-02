import java.util.*;

class VOWELorCONSONANT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> vowels = new ArrayList<>();
        vowels.add("A");
        vowels.add("E");
        vowels.add("I");
        vowels.add("O");
        vowels.add("U");
        String T = scan.next();

        if (vowels.contains(T.toUpperCase())) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

        scan.close();
    }
}
