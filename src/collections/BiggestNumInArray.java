package collections;

public class BiggestNumInArray {
  public static int getBiggestNum(int[] nums) {
    assert nums.length > 0;
    if (nums.length == 1) {
      return nums[0];
    }

    int biggestNum = nums[0];
    for (int num : nums) {
      if (num > biggestNum) {
        biggestNum = num;
      }
    }
    return biggestNum;
  }
}
