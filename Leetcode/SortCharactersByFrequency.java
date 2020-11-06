package Leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
  public static void main(String args[]) {
    String s = "Aabb";
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray())
      map.put(c, map.getOrDefault(c, 0) + 1);

    PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> {
      return map.get(b) - map.get(a);
    });

    queue.addAll(map.keySet());
    StringBuilder builder = new StringBuilder();

    while (!queue.isEmpty()) {
      char c = queue.poll();
      for (int i = 0; i < map.get(c); i++) {
        builder.append(c);
      }
    }
    System.out.println(builder.toString());
  }
}
