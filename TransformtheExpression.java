import java.util.*;

class TransformtheExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            String exp = scan.next();

            char expArr[] = exp.toCharArray();
            Stack<String> dd = new Stack<>();
            String result = "";
            for (char object : expArr) {
                String value = String.valueOf(object);
                if (isOparator(value) == 1) {
                    dd.push(value);
                } else if (isOparator(value) == 2) {
                } else if (isOparator(value) == 3) {
                    result += dd.pop();
                } else {
                    result += value;
                }
            }
            System.out.println(result);

            T--;
        }
        scan.close();



    }

    static int isOparator(String operator) {
        if (operator.equals("-") || operator.equals("+") || operator.equals("*")
                || operator.equals("/") || operator.equals("^")) {
            return 1;
        }
        if (operator.equals("(")) {
            return 2;
        }
        if (operator.equals(")")) {
            return 3;
        }
        return -1;
    }


}
