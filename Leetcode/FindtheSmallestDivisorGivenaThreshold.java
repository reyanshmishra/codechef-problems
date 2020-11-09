package Leetcode;

public class FindtheSmallestDivisorGivenaThreshold {
  public static void main(String arg[]) {
    int nums[] = {1, 2, 5, 9, 14, 15, 19, 200, 2000, 40041, 134221};
    int threshold = 111;
    System.out.println(smallestDivisor(nums, threshold));
  }

  static int smallestDivisor(int[] nums, int threshold) {
    int low = 1;
    int high = nums[nums.length - 1];
    int ans = 0;
    while (low <= high) {
      int totalRes = 0;
      int mid = low + ((high - low) / 2);

      for (int num : nums) {
        int r = num % mid;
        int rounded = r > 0 ? num + (mid - r) : num;
        int res = rounded / mid;
        totalRes += res;
      }

      if (totalRes <= threshold)
        ans = mid;

      if (totalRes <= threshold)
        high = mid - 1;
      else
        low = mid + 1;
    }
    return ans;
  }
}
