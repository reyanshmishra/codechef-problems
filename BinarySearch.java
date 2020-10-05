class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 1, 2, 3, 3, 4, 4, 4, 4, 5, 5, 6, 7, 8, 9, 9, 9, 10};
        int find = 10;
        int low = 0, high = arr.length - 1;
        while (high >= low) {
            int mid = low + high / 2;
            if (arr[mid] == find) {
                System.out.println(mid);
                return;
            }
            if (arr[mid] < find) {
                low = mid + 1;
            } else if (arr[mid] > find) {
                high = mid - 1;
            } else {
                System.out.println("NOT FOUND");
            }
        }
    }
}
