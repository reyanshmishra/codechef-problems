import java.util.Scanner;

class CV {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    while (T-- > 0) {
      int n = scan.nextInt();
      String S = scan.next();
      int count = 0;
      // Pretty strange issue of accessing Chars which are out of range.;
      for (int i = 0; i < S.length(); i++) {
        /**
         * This runs from 0 till 5 that means in the last run the second condition should throw
         * java.lang.StringIndexOutOfBoundsException: String index out of range: Error but its not
         * doing that. But if we access that char with static number then it works does anyone know
         * what's happening behind the hood?
         */
        if (!isVowel(S.charAt(i)) && isVowel(S.charAt(i + 1)))
          count++;
      }
      System.out.println(count);
    }
    scan.close();
  }

  static boolean isVowel(char c) {
    System.out.println(c);
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
  }
}

/**
 * Sample input 1 6 bazeci
 */
