

/**
 *
 * @author reyansh
 */
class COUNTSTRPERM {
  public static void main(String[] args) {
    permutation("AIR", "");
  }

  static void permutation(String str, String prefix) {

    if (str.length() == 0) {
      System.out.println("PERM:- " + prefix);
    } else {
      for (int i = 0; i < str.length(); i++) {
        String rem = str.substring(0, i) + str.substring(i + 1);
        System.out.println("STR:- " + str + " PRE:- " + prefix + "REM:- " + rem);
        permutation(rem, prefix + str.charAt(i));
      }
    }
  }
}
