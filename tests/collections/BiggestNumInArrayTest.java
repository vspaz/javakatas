package collections;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class BiggestNumInArrayTest {
  @Test
  void testGetBiggestNum() {
    Assert.assertEquals(
        140, BiggestNumInArray.getBiggestNum(new int[] {5, 3, 10, 2, -5, 8, 140, 80, 11}));
  }
}
