import java.util.HashMap;

class RansomNote {
  public static void main(String[] args) {
    System.out.println(canMake());
  }

  private static boolean canMake() {
    String r = "bg";
    String m = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
    HashMap<Character, Integer> R = new HashMap<>();
    HashMap<Character, Integer> M = new HashMap<>();
    int i = 0;
    while (i < r.length()) {
      char c = r.charAt(i);
      if (R.containsKey(c)) {
        R.put(c, R.get(c) + 1);
      } else {
        R.put(c, 1);
      }
      i++;
    }
    i = 0;

    while (i < m.length()) {
      char c = m.charAt(i);
      if (M.containsKey(c)) {
        M.put(c, M.get(c) + 1);
      } else {
        M.put(c, 1);
      }
      i++;
    }
    i = 0;

    boolean flag = true;
    while (i < r.length()) {
      char c = r.charAt(i);
      if (!M.containsKey(c)) {
        flag = false;
        break;
      }
      if (R.get(c) > M.get(c)) {
        flag = false;
        break;
      }
      i++;
    }
    return flag;
  }
}
