package Leetcode;

import java.util.Arrays;

public class PermutationinStringSolution {
  public static void main(String[] a) {
    String s1 = "adc";
    String s2 = "dcda";
    int s1L = s1.length();
    int s2L = s2.length();

    int s1Hash[] = new int[26];
    int s2Hash[] = new int[26];
    char s1Array[] = s1.toCharArray();

    for (char c : s1Array)
      s1Hash[c - 'a']++;

    for (int i = 0; i <= s2L - s1L; i++) {
      for (int j = i; j < s1L + i; j++) {
        char c = s2.charAt(j);
        s2Hash[c - 'a']++;
      }
      if (Arrays.equals(s1Hash, s2Hash))
        System.out.println(true);
      s2Hash = new int[26];
    }
    System.out.println(false);
  }
}
