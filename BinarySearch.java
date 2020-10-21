class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 2};
        System.out.println("" + iterativeBS(arr, 2));
        // System.out.println("" + recursiveApproach(arr, 1, 0, arr.length - 1));
    }

    static int iterativeBS(int arr[], int find) {
        int low = 0, high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == find) {
                index = mid;
                break;
            }
            if (arr[mid] < find)
                low = mid + 1;
            if (arr[mid] > find)
                high = mid - 1;
        }
        return index;
    }

    static int recursiveApproach(int arr[], int find, int low, int high) {
        int mid = low + (high - low) / 2;
        int a = arr[mid];
        if (low > high)
            return -1;
        if (a == find)
            return mid;
        if (a < find)
            return recursiveApproach(arr, find, mid + 1, high);
        if (a > find)
            return recursiveApproach(arr, find, low, mid - 1);
        return -1;
    }
}
