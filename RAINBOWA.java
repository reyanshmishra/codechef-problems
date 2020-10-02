import java.util.*;

class RAINBOWA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int n = scan.nextInt();
            int isRainBow = 1;
            Stack<Integer> stacks = new Stack<>();
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();
                if (i > n / 2 && flag) {
                    if (isRainBow - 1 != 7) {
                        flag = false;
                    } else if (flag) {
                        int g = stacks.pop();
                        if (a != g) {
                            flag = false;
                        }
                    }
                } else {
                    stacks.add(a);
                    if (a == isRainBow) {
                        isRainBow++;
                    }
                }
            }
            System.out.println(flag ? "yes" : "no");
            T--;
        }
        scan.close();

    }
}
