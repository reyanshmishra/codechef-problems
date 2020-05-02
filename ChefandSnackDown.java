import java.util.*;

class ChefandSnackDown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        ArrayList<Integer> years = new ArrayList<>();
        years.add(2010);
        years.add(2015);
        years.add(2016);
        years.add(2017);
        years.add(2019);
        while (T > 0) {
            int year = scan.nextInt();
            if (years.contains(year)) {
                System.out.println("HOSTED");
            } else {
                System.out.println("NOT HOSTED");
            }

            T--;
        }
        scan.close();
    }
}
