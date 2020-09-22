import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Test { // Complete the sockMerchant function below.
    public static void main(String[] args) {

    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(0);
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                arr.add(0, arr.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                arr.add(1, arr.get(1) + 1);

            } else {

            }
        }
        return arr;
    }
}
