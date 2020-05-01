import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class SubstringsOfStringMain {
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(3);
                add(2);
                add(223);
            }
        };
        System.out.println("===");

        System.out.println(aa(list));

    }

    public static List<Integer> aa(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(2);
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (hm.get(value) == null) {
                hm.put(value, 1);
            } else {
                hm.put(value, hm.get(value) + 1);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            int hasValue = 0;
            if (hm.containsKey(value)) {
                hasValue = hm.get(value);
            }
            if (hasValue != 2) {
                newList.add(value);
            }
        }
        return newList;
    }
}
