package sorting;

public class Array {
  public static void bubbleSort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length - 1; j++) {
        int curItem = nums[j];
        if (curItem > nums[j + 1]) {
          nums[j] = nums[j + 1];
          nums[j + 1] = curItem;
        }
      }
    }
  }
}
