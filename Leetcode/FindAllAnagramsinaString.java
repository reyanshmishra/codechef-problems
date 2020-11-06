package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {
  public static void main(String[] args) {
    String s = "zaaz", p = "az";
    List<Integer> ans = new ArrayList<>();
    int sSize = s.length();
    int pSize = p.length();
    int sHash[] = new int[26];
    int pHash[] = new int[26];

    for (int i = 0; i < pSize; i++)
      pHash[p.charAt(i) - 'a'] += 1;

    for (int i = 0; i <= sSize - pSize; i++) {
      for (int j = i; j < i + pSize; j++) {
        char c = s.charAt(j);
        sHash[c - 'a'] += 1;
      }


      if (Arrays.equals(sHash, pHash))
        ans.add(i);

      for (int j = i; j < i + pSize; j++) {
        char c = s.charAt(j);
        sHash[c - 'a'] = 0;
      }
    }
    System.out.println(ans);
  }
}
