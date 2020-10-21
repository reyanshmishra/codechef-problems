public class OddOne {
  public static void main(String[] args) {
    int nums[] = {1, 1, 2, 3, 3, 4, 4, 8, 8};
    System.out.println(findIt(nums));
  }

  static int findIt(int nums[]) {
    if (nums.length < 2)
      return 1;

    for (int i = 0; i < nums.length; i += 2) {
      if (i == 0 && nums[i] != nums[i + 1]) {
        return nums[i];
      }
      if (i == nums.length - 1 && nums[i] != nums[i - 1]) {
        return nums[i];
      }
      if (i > 0 && i < nums.length - 1 && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
        return nums[i];
      }
    }
    return 1;
  }
}
