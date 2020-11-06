package Algorithms;

class RabinKarp {
  public static void main(String args[]) {
    String m = "abaababaababababacb";
    String n = "acb";
    int hashN = hashIt(n);
    boolean flag = false;
    int hashM = -1;

    for (int i = 0; i <= m.length() - n.length(); i++) {
      String sub = m.substring(i, i + n.length());
      hashM = hashM == -1 ? hashIt(sub) : rollingHash(m.charAt(i - 1), sub, hashM);
      if (hashN == hashM && n.equals(sub)) {
        flag = true;
        break;
      }
    }

    System.out.println(flag);
  }

  static int hashIt(String n) {
    int hash = 0;
    for (int i = n.length() - 1; i >= 0; i--) {
      int c = n.charAt(i) - 'a';
      hash += c * Math.pow(10, i);
    }
    return hash;
  }

  static int rollingHash(int remove, String subM, int prevHash) {
    int mLength = subM.length();
    int newHash = (int) ((prevHash - remove * Math.pow(10, mLength - 1)) * 10)
        + (10 * subM.charAt(mLength - 1) - 'a');
    System.out.println(prevHash);
    return newHash;
  }
}
