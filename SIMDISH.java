import java.util.*;


class SIMDISH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            HashMap<String, String> dish1 = new HashMap<>();
            int count = 0;
            String res = "";
            for (int i = 0; i < 4; i++) {
                res = "dissimilar";
                String ingredient = scan.next();
                dish1.put(ingredient, ingredient);
            }

            for (int i = 0; i < 4; i++) {
                String ingredient = scan.next();
                if (dish1.containsKey(ingredient)) {
                    count++;
                }
                if (count == 2) {
                    res = "similar";
                }
            }
            System.out.println(res);

            T--;
        }
        scan.close();
    }

}
