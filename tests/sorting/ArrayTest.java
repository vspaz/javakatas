package sorting;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTest {

    @Test
    void testStandardSort() {
        final int[] nums = {5, 0, 4, 3, -1, 2};
        final int[] expected = {-1, 0, 2, 3, 4, 5};

        Arrays.sort(nums);
        Assert.assertEquals(expected, nums);
    }

    @Test
    void testReverseComparator() {
        final List<Integer> nums = Arrays.asList(5, 0, 4, 3, -1, 2);
        final List<Integer> expected = Arrays.asList(5, 4, 3, 2, 0, -1);

        Collections.sort(nums, new ReverseComparator());
        Assert.assertEquals(expected, nums);
    }
}
