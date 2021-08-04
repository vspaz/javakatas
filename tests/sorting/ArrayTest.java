package sorting;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.Arrays;

public class ArrayTest {
    final int[] nums = {5, 0, 4, 3, -1, 2};
    final int[] expected = {-1, 0, 2, 3, 4, 5};

    @Test
    void testStandardSort() {
        Arrays.sort(nums);
        Assert.assertEquals(expected, nums);
    }
}
