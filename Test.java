
class Test {
    public static void main(String[] args) {
        System.out.println(isSquare(2147483647));
    }

    static boolean isSquare(int n) {
        long low = 1, high = n;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long product = mid * mid;
            if (product == n) {
                return true;
            } else if (product > n) {
                high = mid - 1;
            } else if (product < n) {
                low = mid + 1;
            }
        }
        return false;
    }
}
