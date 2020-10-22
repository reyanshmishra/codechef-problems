import java.util.Stack;

public class RemoveKDigits {
  public static void main(String p[]) {
    System.out.println(removeKdigits("00110413", 2));
  }

  static String removeKdigits(String num, int k) {
    if (k >= num.length()) {
      return "0";
    }

    Stack<Character> chars = new Stack<>();

    for (int i = 0; i < num.length(); i++) {

      while (!chars.isEmpty() && k > 0 && chars.peek() > num.charAt(i)) {
        chars.pop();
        k--;
      }

      chars.add(num.charAt(i));
    }

    while (k > 0) {
      chars.pop();
      k--;
    }

    StringBuilder sb = new StringBuilder();
    while (!chars.isEmpty()) {
      sb.append(chars.pop());
    }

    while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') {
      sb.deleteCharAt(sb.length() - 1);
    }
    sb.reverse();

    return sb.length() == 0 ? "0" : sb.toString();
  }

  static String removeDigit(String num, int n) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < num.length(); i++) {
      char c = num.charAt(i);

      if (!stack.isEmpty() && n > 0 && stack.peek() > c) {

      }

    }

    while (n > 0 && !stack.isEmpty()) {
      n--;
      stack.pop();
    }
    String output = "";

    for (Character character : stack) {
      output += character;
    }

    if (output.equals(""))
      return "0";

    return output;
  }
}
