import java.io.*;
import java.util.*;



public class SubstringsOfStringMain {
    public static void main(String[] args) throws IOException {


        System.out.println("===");


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
