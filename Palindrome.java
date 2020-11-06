public class Palindrome {


  static boolean isPalindrome(String str, int size, int i) {

    if (size <= 1 || i == size / 2)
      return true;
    if (str.charAt(i) == str.charAt(size - i - 1))
      return isPalindrome(str, size, i + 1);
    else
      return false;

  }

  public static void main(String args[]) {
    String str = "mam";
    System.out.println(isPalindrome(str, str.length(), 0));

  }
}
