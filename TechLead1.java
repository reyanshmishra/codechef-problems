import java.util.*;


public class TechLead1 {

    public static void main(String[] args) {
        String prefix = "do";
        String names[] = new String[] {"dog", "dodge", "bark", "cat", "dooc", "do"};
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (prefix.length() < name.length()
                    && name.substring(0, prefix.length()).equals(prefix)) {
                list.add(name);
            }
        }
        System.out.println(list.toArray());
    }
}
