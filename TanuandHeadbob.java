import java.util.Scanner;

class TanuandHeadbob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            scan.nextInt();
            String string = scan.next();
            String found = "NOT SURE";
            for (int i = 0; i < string.length(); i++) {
                String value = String.valueOf(string.charAt(i));
                if (!value.equals("N")) {
                    if (value.equals("Y")) {
                        found = "NOT INDIAN";
                    } else {
                        found = "INDIAN";
                    }
                }

            }
            System.out.println(found);
            T--;
        }
        scan.close();
    }
}
